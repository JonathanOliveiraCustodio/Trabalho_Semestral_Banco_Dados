package applicationcontroller.model;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import application.TelaCadastroParceiro;
import application.TelaEspacoParceiro;
import application.model.CadastroParceiro;


import application.persitencia.GenericDao;
import application.persitencia.LoginParceiroDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginParceiroController implements EventHandler<Event>{
	private TextField txlogin;
	private TextField txsenha;
	
	  
	public LoginParceiroController(TextField txlogin, TextField txsenha) {
		
		this.txlogin = txlogin;
		this.txsenha = txsenha;
	}


	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
		CadastroParceiro c = new CadastroParceiro();
		if (!cmd.contains("Listar")) {
			c.setEmail(txlogin.getText());
			
		}
		try {
		if(cmd.contains("Logar")) {
			logarParceiro(c);
		}else if(cmd.contains("Cadastrar")) {
			abrirCadastParceiro();
		}
		}catch(SQLException | ClassNotFoundException e) { 
		JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
		}	
	}
	
		private boolean logarParceiro(CadastroParceiro c) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		LoginParceiroDao pDao= new LoginParceiroDao(gDao);
		c=pDao.consultar(c);
		if (c != null) {
	        if (c.getSenha() != null && c.getSenha().equals(txsenha.getText())) {
	            abrirEspacoParceiro();
	            return true;
	        } else {
	            JOptionPane.showMessageDialog(null, "Senha incorreta!");
	            return false;
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "E-mail incorreto");
	        return false;
	    }
		}
		
		





	public void abrirEspacoParceiro() {
	TelaEspacoParceiro tela =new TelaEspacoParceiro();
		tela.start(new Stage());
}
	public void abrirCadastParceiro() {
		TelaCadastroParceiro tela =new TelaCadastroParceiro();
		tela.start(new Stage());

}
}
