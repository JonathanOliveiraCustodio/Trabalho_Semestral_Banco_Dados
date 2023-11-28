package applicationcontroller.model;

import java.sql.SQLException;

import application.model.CadastroProdutoParceiro;

import application.persitencia.GenericDao;
import application.persitencia.ListaVendasDao;
import application.persitencia.VisualizacaoProdutoDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;


public class CarrinhoController implements EventHandler<Event>{
     private Label lblcodigo1;
	 private Label lblnome ;
	
	 
	 private Label lblvalor1 ;
	 
	 
	 private static int cod;
	 
	 @SuppressWarnings("static-access")
	public CarrinhoController(int cod) {
		 this.cod= cod;
	 }
	
	
	

	
	public CarrinhoController(Label lblcodigo1, Label lblnome,  Label lblvalor1) {
		super();
		this.lblcodigo1 = lblcodigo1;
		this.lblnome = lblnome;
		this.lblvalor1 = lblvalor1;
	}




	@Override
		public void handle(Event event) {
		CadastroProdutoParceiro p = new CadastroProdutoParceiro();
		 p.setCodProduto(cod);
		
		 
		String cmd = event.getSource().toString();
			
			if(cmd.contains("Buscar")){
				 try {
					buscarProduto1(p);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}else if(cmd.contains("Comprar")) {
				try {
					
					insertComprar(p);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
			
		}

	private void insertComprar(CadastroProdutoParceiro p) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		ListaVendasDao pDao= new ListaVendasDao(gDao);
		pDao.insert(p);
		limpar();
		
	}





	private void limpar() {
		lblcodigo1.setText("");
		lblnome.setText(""); 
		lblvalor1.setText("");          
		          
		
	}





	private void buscarProduto1(CadastroProdutoParceiro p) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		VisualizacaoProdutoDao ppDao = new VisualizacaoProdutoDao(gDao);	
		p = ppDao.consultar(p);
		lblcodigo1.setText(String.valueOf(p.getCodProduto()));
		lblnome.setText(String.valueOf(p.getNomeProduto()));	
		
		lblvalor1.setText(String.valueOf(p.getPrecoVenda()));
	}
}
