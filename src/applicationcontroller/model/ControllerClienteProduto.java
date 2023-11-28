package applicationcontroller.model;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import application.model.CadastroProdutoParceiro;
import application.persitencia.CadastroProdutoParceiroDao;
import application.persitencia.GenericDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;

public class ControllerClienteProduto implements EventHandler<Event> {
	private TextArea talistaProdutos;
	
	
	
	public ControllerClienteProduto(TextArea talistaProdutos) {
		super();
		this.talistaProdutos = talistaProdutos;
	}
	
	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
		
		
		try {
		if(cmd.contains("Pesquisar Produtos")) {
			listarProdutostotal();
		}
	} catch (SQLException | ClassNotFoundException e) {
		JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
	}	
	}
	private void listarProdutostotal() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroProdutoParceiroDao ppDao = new CadastroProdutoParceiroDao(gDao);
	    List<CadastroProdutoParceiro> produtos = ppDao.Listar();

	    StringBuffer buffer = new StringBuffer();
	    for (CadastroProdutoParceiro p : produtos) {
	        buffer.append(p);
	        buffer.append("\n");
	    }
	    talistaProdutos.setText(buffer.toString());
	  
	}

}
