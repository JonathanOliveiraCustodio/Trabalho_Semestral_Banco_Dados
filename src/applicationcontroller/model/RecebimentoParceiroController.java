package applicationcontroller.model;


import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import application.model.DadosBancarios1;
import application.persitencia.CadastroProdutoParceiroDao;
import application.persitencia.DadosBancarioDao;
import application.persitencia.GenericDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RecebimentoParceiroController implements EventHandler<Event>{
	
	private TextField txsaldoDisponivel;
	//private TextField txsaldoliberar;
	//private TextField txtransferir;
	private TextArea tadadosbanco;
	
	
	public RecebimentoParceiroController(TextArea tadadosbanco, TextField txsaldoDisponivel, TextField txsaldoliberar,
			TextField txtransferir, TextField txid_dados) {
	
		this.txsaldoDisponivel = txsaldoDisponivel;
		//this.txsaldoliberar = txsaldoliberar;
		//this.txtransferir = txtransferir;
		this.tadadosbanco = tadadosbanco;
	}

	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
	
		
		try {
			if(cmd.contains("Buscar Conta")) {
			listardados();
			SomaValores("");
			}
		}catch(SQLException | ClassNotFoundException e) { 
		JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
		}
	}

	private void SomaValores(String p) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		 CadastroProdutoParceiroDao pDao = new CadastroProdutoParceiroDao(gDao);
		 p= pDao.consultaVlor(p);
		 txsaldoDisponivel.setText(p);
		 
		
	}

	private void listardados() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		DadosBancarioDao dDao = new DadosBancarioDao(gDao);
		List <DadosBancarios1> dados =dDao.Listar();
		StringBuffer buffer = new StringBuffer();
		for (DadosBancarios1 d : dados) {
			buffer.append(d);
			buffer.append("\n");
		}
		 tadadosbanco.setText(buffer.toString());
		  

	}

	
	
	
	
	
	
}
