package applicationcontroller.model;

import java.sql.SQLException;
import application.model.CadastroProdutoParceiro;
import application.persitencia.GenericDao;
import application.persitencia.ListaVendasDao;
import application.persitencia.VisualizacaoProdutoDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class VisualizacaoProdutoController implements EventHandler<Event>{
	private static int cod;
	@SuppressWarnings("static-access")
	public VisualizacaoProdutoController(int cod) {
	
		this.cod = cod;
	}

	private Label txnomeProd;
	private Label txcodigo;
	private Label txdesc;
	private Label txgenero;
	private Label txmaterial;
	private Label txcomposicao;
	private Label txorigem; 
	private Label txindicado;
	private Label txmarca;
	private Label txcategoria;
	private Label txtqtdEstoque;
	private Label txtamanho;
	private Label txcor;
	private Label txpreco;

		
	public VisualizacaoProdutoController(Label txnomeProd, Label txcodigo, Label txdesc,
			Label txgenero, Label txmaterial, Label txcomposicao, Label txorigem,
			Label txindicado, Label txmarca, Label txcategoria, Label txtqtdEstoque,
			Label txtamanho, Label txcor, Label txpreco) {
		super();
		this.txnomeProd = txnomeProd;
		this.txcodigo = txcodigo;
		this.txdesc = txdesc;
		this.txgenero = txgenero;
		this.txmaterial = txmaterial;
		this.txcomposicao = txcomposicao;
		this.txorigem = txorigem;
		this.txindicado = txindicado;
		this.txmarca = txmarca;
		this.txcategoria = txcategoria;
		this.txtqtdEstoque = txtqtdEstoque;
		this.txtamanho = txtamanho;
		this.txcor = txcor;
		this.txpreco = txpreco;
		
	}
	
	

	@SuppressWarnings("static-access")
	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
	     CadastroProdutoParceiro pp = new CadastroProdutoParceiro();
		
			if (cmd.contains("Adicionar1")) {
				
				
			} else if (cmd.contains("Comprar")) {
				
				try {
					pp.setCodProduto(cod);
					insertComprar(pp);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else if (cmd.contains("Visualizar")) {
				try {
					pp.setCodProduto(cod);
					buscarProduto(pp);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}else if (cmd.contains("Buscar")) {
				
			} else if (cmd.contains("Comprar")) {
				
			
			}
		
	}
	



	private void insertComprar(CadastroProdutoParceiro pp) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		ListaVendasDao pDao= new ListaVendasDao(gDao);
		pDao.insert(pp);
	
		
	}



	private void buscarProduto(CadastroProdutoParceiro pp) throws ClassNotFoundException, SQLException {	
		GenericDao gDao = new GenericDao();
		VisualizacaoProdutoDao ppDao = new VisualizacaoProdutoDao(gDao);	
		pp = ppDao.consultar(pp);		
		txcodigo.setText(String.valueOf(pp.getCodProduto()));
		txnomeProd.setText(String.valueOf(pp.getNomeProduto()));	
		txdesc.setText(String.valueOf(pp.getDescricao()));
		txgenero.setText(String.valueOf(pp.getGenero()));
		txmaterial.setText(String.valueOf(pp.getMaterial()));
		txcomposicao.setText(String.valueOf(pp.getComposicao()));
		txorigem.setText(String.valueOf(pp.getOrigem()));
		txindicado.setText(String.valueOf(pp.getIndicacao()));
		txmarca.setText(String.valueOf(pp.getMarca()));
		txcategoria.setText(String.valueOf(pp.getCategoria()));
		txtqtdEstoque.setText(String.valueOf(pp.getQtdEstoque()));
		txtamanho.setText(String.valueOf(pp.getTamanho()));
		txcor.setText(String.valueOf(pp.getCor()));
		txpreco.setText(String.valueOf(pp.getPrecoVenda()));
	}



  	
}

