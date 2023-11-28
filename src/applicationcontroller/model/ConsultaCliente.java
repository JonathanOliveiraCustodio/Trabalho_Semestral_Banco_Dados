package applicationcontroller.model;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;


import application.model.CadastroProdutoParceiro;
import application.persitencia.GenericDao;
import application.persitencia.ListaCompraDao;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;

public class ConsultaCliente implements EventHandler<Event>{
private TextArea talistaProdutos;
	
	
	public ConsultaCliente(TextArea talistaProdutos) {
	
		this.talistaProdutos = talistaProdutos;
	}

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
		ListaCompraDao pDao = new ListaCompraDao(gDao);
	    List<CadastroProdutoParceiro> produtos = pDao.Listar();

	    StringBuffer buffer = new StringBuffer();
	    for (CadastroProdutoParceiro p : produtos) {
	        buffer.append(p);
	        buffer.append("\n");
	    }
	        talistaProdutos.setText(buffer.toString());
		    
		    

		}
	
}
