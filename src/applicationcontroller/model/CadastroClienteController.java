package applicationcontroller.model;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import application.model.CadastroCliente;

import application.persitencia.CadastroClienteDao;

import application.persitencia.GenericDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class CadastroClienteController implements EventHandler<Event> {

	private TextField txnome;
	private TextField txcpf;
	private TextField txdatanasc;
	private TextField txsenha;
	private TextField txemail;
	private TextField txtele;
	private TextField txcep;
	private TextField txlog;
	private TextField txnum;
	private TextField txcomp;
	private TextField txbairro;
	private TextField txcidade;
	private TextField txestado;
	private TextField txpontoref;
	private TextField txcod;
	
	
	public CadastroClienteController(TextField txnome, TextField txcpf, TextField txdatanasc, TextField txsenha,
			TextField txemail, TextField txtele, TextField txcep, TextField txlog, TextField txnum, TextField txcomp,
			TextField txbairro, TextField txcidade, TextField txestado, TextField txpontoref, TextField txcod) {
	
		this.txnome = txnome;
		this.txcpf = txcpf;
		this.txdatanasc = txdatanasc;
		this.txsenha = txsenha;
		this.txemail = txemail;
		this.txtele = txtele;
		this.txcep = txcep;
		this.txlog = txlog;
		this.txnum = txnum;
		this.txcomp = txcomp;
		this.txbairro = txbairro;
		this.txcidade = txcidade;
		this.txestado = txestado;
		this.txpontoref = txpontoref;
		this.txcod = txcod;
	}


	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
		CadastroCliente c = new CadastroCliente();
		if (!cmd.contains("Listar")) {
			c.setCodcli(Integer.parseInt(txcod.getText()));
			
		}
		
			if(cmd.contains("Cadastrar")||cmd.contains("Editar")) {
			
			c.setNome_cli(txnome.getText());
			c.setCpf(txcpf.getText());
			c.setDatanasc(txdatanasc.getText());
			c.setSenha(txsenha.getText());
			c.setEmail_cli(txemail.getText());
			c.setTelefone_cli(txtele.getText());
			c.setCep_cli(txcep.getText());
			c.setLogradou_cli(txlog.getText());
			c.setNum_cli(Integer.parseInt(txnum.getText()));
			c.setComplemento_cli(txcomp.getText());
			c.setBairro_cli(txbairro.getText());
			c.setCidade_cli(txcidade.getText());
			c.setEstado_cli(txestado.getText());
			c.setPonto_cli(txpontoref.getText());
					
	}
		try {
			if (cmd.contains("Cadastrar")) {
				CadastroCliente(c);
			} else if (cmd.contains("Editar")) {
				alterarCliente(c);
			}else if(cmd.contains("Buscar")) {
				buscarCliente(c);
			}
			}catch(SQLException | ClassNotFoundException e) { 
				JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
				}
		
		
	}


	private void buscarCliente(CadastroCliente cc) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroClienteDao pDao= new CadastroClienteDao(gDao);
		cc=pDao.consultar(cc);
		txnome.setText(String.valueOf(cc.getNome_cli()));   
		txcpf.setText(String.valueOf(cc.getCpf()));     
		txdatanasc.setText(String.valueOf(cc.getDatanasc()));
		txsenha.setText(String.valueOf(cc.getSenha()));   
		txemail.setText(String.valueOf(cc.getEmail_cli()));   
		txtele.setText(String.valueOf(cc.getTelefone_cli()));    
		txcep.setText(String.valueOf(cc.getCep_cli()));     
		txlog.setText(String.valueOf(cc.getLogradou_cli()));     
		txnum.setText(String.valueOf(cc.getNum_cli()));     
		txcomp.setText(String.valueOf(cc.getComplemento_cli()));  
		txbairro.setText(String.valueOf(cc.getBairro_cli()));  
		txcidade.setText(String.valueOf(cc.getCidade_cli()));  
		txestado.setText(String.valueOf(cc.getEstado_cli()));  
		txpontoref.setText(String.valueOf(cc.getPonto_cli()));
		txcod.setText(String.valueOf(cc.getCodcli()));     
	}


	private void CadastroCliente(CadastroCliente c) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroClienteDao dDao =new CadastroClienteDao(gDao);
		dDao.insert(c);
		limparCampos();
		
	}


	private void alterarCliente(CadastroCliente c) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroClienteDao dDao =new CadastroClienteDao(gDao);
		dDao.atualizar(c);
		limparCampos();
	}


	private void limparCampos() {
		txnome.setText("");
		txcpf.setText("");
		txdatanasc.setText("");
		txsenha.setText("");
		txemail.setText("");
		txtele.setText("");
		txcep.setText("");
		txlog.setText("");
		txnum.setText("");
		txcomp.setText("");
		txbairro.setText("");
		txcidade.setText("");
		txestado.setText("");
		txpontoref.setText("");
		txcod.setText("");
		     
		
	}

}
