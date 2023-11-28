package applicationcontroller.model;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;


import application.model.CadastroProdutoParceiro;
import application.persitencia.GenericDao;
import application.persitencia.ListaVendasDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;

public class ConsultaPareiroc implements EventHandler<Event>  {
	private TextArea talistaProdutos;
	
	
	public ConsultaPareiroc(TextArea talistaProdutos) {
		super();
		this.talistaProdutos = talistaProdutos;
	}

	@Override
	public void handle(Event event) {
		
	
		String cmd = event.getSource().toString();
		if(cmd.contains("Pesquisar Produtos")) {
			
			try {
				listarProdutostotal();
			} catch (ClassNotFoundException | SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
	}

	private void listarProdutostotal() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		ListaVendasDao pDao = new ListaVendasDao(gDao);
	    List<CadastroProdutoParceiro> produtos = pDao.Listar();

	    StringBuffer buffer = new StringBuffer();
	    for (CadastroProdutoParceiro p : produtos) {
	        buffer.append(p);
	        buffer.append("\n");
	    }
	        talistaProdutos.setText(buffer.toString());
		    
		    

		}
	

		
		}	
