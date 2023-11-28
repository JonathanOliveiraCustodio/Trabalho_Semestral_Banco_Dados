package applicationcontroller.model;

import java.sql.SQLException;

import javax.swing.JOptionPane;


import application.model.CadastroParceiro;

import application.persitencia.CadastroParceiroDao;
import application.persitencia.GenericDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class CadastroParceiroController implements EventHandler<Event> {
	
		
		private TextField txnomeparceiro;
		private TextField txcnpjparceiro;
		private TextField txsocialparceiro;
		private TextField txfantasiaparceiro;
		private TextField txlogradouroparceiro;
		private TextField txcepparceiro;
		private TextField txcomplementoparceir;
		private TextField txtelefoneparceiro;
		private TextField txemailparceiro;
		private TextField txconfEmailparceiro;
		private TextField txsenhaparceiro;
		private TextField txconfsenhaparceiro;
		private TextField txcodparceiro;
		private TextField txdataAbertparceiro;
		private TextField txnumparceiro;
		private TextField txbairroparceiro;
		


public CadastroParceiroController(TextField txnomeparceiro, TextField txcnpjparceiro,
				TextField txsocialparceiro, TextField txfantasiaparceiro, TextField txlogradouroparceiro,
				TextField txcepparceiro, TextField txcomplementoparceir, TextField txtelefoneparceiro,
				TextField txemailparceiro, TextField txconfEmailparceiro, TextField txsenhaparceiro,
				TextField txconfsenhaparceiro, TextField txcodparceiro, TextField txdataAbertparceiro,
				TextField txnumparceiro, TextField txbairroparceiro) {
			
			this.txnomeparceiro = txnomeparceiro;
			this.txcnpjparceiro = txcnpjparceiro;
			this.txsocialparceiro = txsocialparceiro;
			this.txfantasiaparceiro = txfantasiaparceiro;
			this.txlogradouroparceiro = txlogradouroparceiro;
			this.txcepparceiro = txcepparceiro;
			this.txcomplementoparceir = txcomplementoparceir;
			this.txtelefoneparceiro = txtelefoneparceiro;
			this.txemailparceiro = txemailparceiro;
			this.txconfEmailparceiro = txconfEmailparceiro;
			this.txsenhaparceiro = txsenhaparceiro;
			this.txconfsenhaparceiro = txconfsenhaparceiro;
			this.txcodparceiro = txcodparceiro;
			this.txdataAbertparceiro = txdataAbertparceiro;
			this.txnumparceiro = txnumparceiro;
			this.txbairroparceiro = txbairroparceiro;
		}

@Override
public void handle(Event  event) {
	String cmd = event.getSource().toString();
	CadastroParceiro c = new CadastroParceiro();
	
	if (!cmd.contains("Listar")) {
		c.setCodparc(Integer.parseInt(txcodparceiro.getText()));
		
	}
	
		if(cmd.contains("Cadastrar")||cmd.contains("Editar Cadastro")) {
		
		c.setNome(txnomeparceiro.getText());
		c.setCnpj(txcnpjparceiro.getText());
		c.setSocial(txsocialparceiro.getText());
		c.setNomefant(txfantasiaparceiro.getText());
		c.setLogradouro(txlogradouroparceiro.getText());
		c.setCep(txcepparceiro.getText());
		c.setComplemento(txcomplementoparceir.getText());
		c.setTelefone( txtelefoneparceiro.getText());
		c.setEmail(txemailparceiro.getText());
		c.setConfemail(txconfEmailparceiro.getText());
		c.setSenha(txsenhaparceiro.getText());
		c.setCofsenha(txconfsenhaparceiro.getText());
		c.setDataAbert(txdataAbertparceiro.getText());
		c.setNum(Integer.parseInt(txnumparceiro.getText()));
		c.setBairro(txbairroparceiro.getText());
}
	try {
		if (cmd.contains("Cadastrar")) {
			CadastroParceiro(c);
		} else if (cmd.contains("Editar Cadastro")) {
			alterarParceiro(c);
		}else if (cmd.contains("Buscar")){
			BuscarParceiro(c);
		}
		
		}catch(SQLException | ClassNotFoundException e) { 
			JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
			}
	
	
}

private void BuscarParceiro(CadastroParceiro c) throws ClassNotFoundException, SQLException {
	GenericDao gDao = new GenericDao();
	CadastroParceiroDao pDao= new CadastroParceiroDao(gDao);
	c=pDao.consultar(c);
	txnomeparceiro.setText(String.valueOf(c.getNome()));       
	txcnpjparceiro.setText(String.valueOf( c.getCnpj()));     
	txsocialparceiro.setText(String.valueOf(c.getSocial()));     
	txfantasiaparceiro.setText(String.valueOf(c.getNomefant()));   
	txlogradouroparceiro.setText(String.valueOf(c.getLogradouro())); 
	txcepparceiro.setText(String.valueOf(c.getCep()));        
	txcomplementoparceir.setText(String.valueOf(c.getComplemento())); 
	txtelefoneparceiro.setText(String.valueOf(c.getTelefone()));   
	txemailparceiro.setText(String.valueOf(c.getEmail()));      
	txconfEmailparceiro.setText(String.valueOf(c.getEmail()));  
	txcodparceiro.setText(String.valueOf(c.getCodparc()));        
	txdataAbertparceiro.setText(String.valueOf(c.getDataAbert()));  
	txnumparceiro.setText(String.valueOf(c.getNum()));        
	txbairroparceiro.setText(String.valueOf(c.getBairro()));     
	
}

private void CadastroParceiro(CadastroParceiro c) throws ClassNotFoundException, SQLException {
	GenericDao gDao = new GenericDao();
	CadastroParceiroDao dDao =new CadastroParceiroDao(gDao);
	dDao.insert(c);
	limparCampos();
	
}



private void alterarParceiro(CadastroParceiro c) throws ClassNotFoundException, SQLException {
	GenericDao gDao = new GenericDao();
	CadastroParceiroDao dDao =new CadastroParceiroDao(gDao);
	dDao.atualizar(c);
	limparCampos();
	
	
}
private void limparCampos() {
	txnomeparceiro.setText("");    
	txcnpjparceiro.setText("");     
	txsocialparceiro.setText("");   
    txfantasiaparceiro.setText(""); 
    txlogradouroparceiro.setText("");
    txcepparceiro.setText("");      
    txcomplementoparceir.setText("");
    txtelefoneparceiro.setText("");
    txemailparceiro.setText("");    
    txconfEmailparceiro.setText("");
    txsenhaparceiro.setText("");    
    txconfsenhaparceiro.setText("");
    txcodparceiro.setText("");      
    txdataAbertparceiro.setText("");
    txnumparceiro.setText("");      
    txbairroparceiro.setText("");   
    
}
}