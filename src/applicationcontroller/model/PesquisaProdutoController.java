package applicationcontroller.model;


import java.sql.SQLException;
import java.util.List;

import application.TelaCarrinho;
import application.TelaVisualizacaoProduto;
import application.model.CadastroProdutoParceiro;
import application.persitencia.GenericDao;
import application.persitencia.PesquisaProdutoDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class PesquisaProdutoController implements EventHandler<Event>{
	
	private Label lblDNomeP1;
	private Label lblDTamanho1;
	private Label lblDMarca1;
	private Label lblDPreco1;
	private Label lblDNomeP2;
	private Label lblDTamanho2;
	private Label lblDMarca2;
	private Label lblDPreco2;
	private Label lblDNomeP3;
	private Label lblDTamanho3;
	private Label lblDMarca3;
	private Label lblDPreco3;
	private Label lblDNomeP4;
	private Label lblDTamanho4;
	private Label lblDMarca4;
	private Label lblDPreco4;
	private static int cod1;
	private static int cod2;
	private static int cod3;
	private static int cod4;
	
	

		public PesquisaProdutoController(Label lblDNomeP1, Label lblDTamanho1, Label lblDMarca1, Label lblDPreco1,
			Label lblDNomeP2, Label lblDTamanho2, Label lblDMarca2, Label lblDPreco2, Label lblDNomeP3,
			Label lblDTamanho3, Label lblDMarca3, Label lblDPreco3, Label lblDNomeP4, Label lblDTamanho4,
			Label lblDMarca4, Label lblDPreco4) {
		super();
		this.lblDNomeP1 = lblDNomeP1;
		this.lblDTamanho1 = lblDTamanho1;
		this.lblDMarca1 = lblDMarca1;
		this.lblDPreco1 = lblDPreco1;
		this.lblDNomeP2 = lblDNomeP2;
		this.lblDTamanho2 = lblDTamanho2;
		this.lblDMarca2 = lblDMarca2;
		this.lblDPreco2 = lblDPreco2;
		this.lblDNomeP3 = lblDNomeP3;
		this.lblDTamanho3 = lblDTamanho3;
		this.lblDMarca3 = lblDMarca3;
		this.lblDPreco3 = lblDPreco3;
		this.lblDNomeP4 = lblDNomeP4;
		this.lblDTamanho4 = lblDTamanho4;
		this.lblDMarca4 = lblDMarca4;
		this.lblDPreco4 = lblDPreco4;
	}
		





	public static int getCod1() {
			return cod1;
		}

		public static void setCod1(int cod1) {
			PesquisaProdutoController.cod1 = cod1;
		}

		public static int getCod2() {
			return cod2;
		}

		public static void setCod2(int cod2) {
			PesquisaProdutoController.cod2 = cod2;
		}

		public static int getCod3() {
			return cod3;
		}

		public static void setCod3(int cod3) {
			PesquisaProdutoController.cod3 = cod3;
		}

		public static int getCod4() {
			return cod4;
		}

		public static void setCod4(int cod4) {
			PesquisaProdutoController.cod4 = cod4;
		}



	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
		
		try {
			listarProdutos();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
			if (cmd.contains("Visualizar 1") ) {
				visualiar(cod1);
				
			} else if (cmd.contains("Visualizar 2")) {
				visualiar(cod2);
			} else if (cmd.contains("Visualizar 3")) {
				visualiar(cod3);
			} else if (cmd.contains("Visualizar 4")) {
				visualiar(cod4);
			}else if (cmd.contains("Comprar")) {

				
			} else if (cmd.contains("Adicionar 1")) {
				carrinho(cod1);
			} else if (cmd.contains("Adicionar 2")) {
				carrinho(cod2);
			} else if (cmd.contains("Adicionar 3")) {
				carrinho(cod3);
			} else if (cmd.contains("Adicionar 4")) {
				carrinho(cod4);
					
					
			}else if (cmd.contains("Buscar")) {
				
			} else if (cmd.contains("Comprar")) {
				
			
			}
		
	}



	private void carrinho(int cod) {
		TelaCarrinho c = new TelaCarrinho();
		c.start(new Stage());
		new CarrinhoController(cod);
	}



	private void visualiar(int cod) {
		TelaVisualizacaoProduto vi = new TelaVisualizacaoProduto();
		vi.start(new Stage());
		new VisualizacaoProdutoController(cod);
		
		
	}
  
	@SuppressWarnings("unused")
	
	public void listarProdutos() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		PesquisaProdutoDao ppDao = new PesquisaProdutoDao(gDao);
	    List<CadastroProdutoParceiro> pp = ppDao.Listar();
	    
		    if (pp.size() >= 1) {
		    	 preencherRotulosProduto(lblDNomeP1, lblDTamanho1, lblDMarca1, lblDPreco1, pp.get(0));
		    	   	 cod1 = pp.get(0).getCodProduto();                                                      
		    }
		    
		    if (pp.size() >= 2) {
		        preencherRotulosProduto(lblDNomeP2, lblDTamanho2, lblDMarca2, lblDPreco2, pp.get(1));
		        cod2 = pp.get(1).getCodProduto();
		    }
		    if(pp.size()>=3) {
		    	 preencherRotulosProduto(lblDNomeP3, lblDTamanho3, lblDMarca3, lblDPreco3, pp.get(2));
		    	 cod3 = pp.get(2).getCodProduto();
		    }
		   if(pp.size()>=4) {
			   preencherRotulosProduto(lblDNomeP4, lblDTamanho4, lblDMarca4, lblDPreco4, pp.get(3));
			   cod4 = pp.get(3).getCodProduto();	
		   }
		}

		@SuppressWarnings("unused")
		private void preencherRotulosProduto(Label nomeLabel, Label tamanhoLabel, Label marcaLabel, Label precoLabel, CadastroProdutoParceiro produto) {
		    
			nomeLabel.setText(String.valueOf(produto.getNomeProduto()));
		    tamanhoLabel.setText(String.valueOf(produto.getTamanho()));
		    marcaLabel.setText(String.valueOf(produto.getMarca()));
		    precoLabel.setText(String.valueOf(produto.getPrecoVenda()));
		}
		

	
}