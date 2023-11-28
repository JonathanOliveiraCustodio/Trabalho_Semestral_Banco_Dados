package applicationcontroller.model;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import application.TelaCadastroCliente;
import application.TelaEspacoCliente;
import application.model.CadastroCliente;
import application.persitencia.GenericDao;
import application.persitencia.LoginClienteDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginClienteController  implements EventHandler<Event>{
			private TextField txtlogin;
			private TextField txtsenha;
			
			public LoginClienteController(TextField txtlogin, TextField txtsenha) {
			
				this.txtlogin = txtlogin;
				this.txtsenha = txtsenha;
			}


			@Override
			public void handle(Event event) {
				String cmd = event.getSource().toString();
				CadastroCliente c = new CadastroCliente();
				if (!cmd.contains("Listar")) {
					c.setEmail_cli(txtlogin.getText());
					
				}
				try {
				if(cmd.contains("Logar")) {
					logarCliente(c);
				}else if(cmd.contains("Continuar")) {
					abrirCadastCliente();
				}
				}catch(SQLException | ClassNotFoundException e) { 
				JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
				}	
			}
			
			private boolean logarCliente(CadastroCliente c) throws ClassNotFoundException, SQLException {
				GenericDao gDao = new GenericDao();
				LoginClienteDao pDao= new LoginClienteDao(gDao);
				c=pDao.consultar(c);
				if (c != null) {
			        if (c.getSenha() != null && c.getSenha().equals(txtsenha.getText())) {
			            abrirEspacoCliente();
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
			private void abrirEspacoCliente() {
				TelaEspacoCliente tela = new TelaEspacoCliente();
				tela.start(new Stage());
			}

			private void abrirCadastCliente() {
				TelaCadastroCliente tela= new TelaCadastroCliente();
				tela.start(new Stage());
				
			}
}
