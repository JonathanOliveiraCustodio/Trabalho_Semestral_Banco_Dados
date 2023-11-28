package applicationcontroller.model;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import application.model.CadastroParceiro;
import application.model.DadosBancarios1;
import application.persitencia.DadosBancarioDao;
import application.persitencia.GenericDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class DadosBancarioController implements EventHandler<Event>{
	
	private TextField txbanco ;
	private TextField txagencia ;
	private TextField txnumconta ;
	private TextField txtipoconta ;
	private TextField txnometitular ;
	private TextField txcnpj ;

		public DadosBancarioController( TextField txbanco, TextField txagencia, TextField txnumconta,
			TextField txtipoconta, TextField txnometitular, TextField txcnpj) {
		
		
		this.txbanco = txbanco;
		this.txagencia = txagencia;
		this.txnumconta = txnumconta;
		this.txtipoconta = txtipoconta;
		this.txnometitular = txnometitular;
		this.txcnpj = txcnpj;
	}

	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
		DadosBancarios1 d = new DadosBancarios1();
		CadastroParceiro c = new CadastroParceiro();
		if(!cmd.contains("Listar")) {
			d.setCod(c.getCodparc());
		}
		if(cmd.contains("Salvar")||cmd.contains("Editar")) {
			d.setBanco(txbanco.getText());
			d.setAgencia(txagencia.getText());
			d.setNumconta(txnumconta.getText());
			d.setTipodeconta(txtipoconta.getText());
			d.setNometitular(txnometitular.getText());
			d.setCnpj(txcnpj.getText());
		}
		try {
			if (cmd.contains("Salvar")) {
				cadastrarDados(d);
			} else if (cmd.contains("Editar")) {
				alterarDados(d);
			} else if (cmd.contains("Excluir")) {
				excluirDados(d);
			}else if (cmd.contains("Buscar")) {
				buscarDados(d);
			} else if (cmd.contains("Listar")) {
				listarDados();
			}
					
		}catch(SQLException | ClassNotFoundException e) { 
		JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void cadastrarDados(DadosBancarios1 d) throws ClassNotFoundException,SQLException {
		GenericDao gDao = new GenericDao();
		DadosBancarioDao dDao =new DadosBancarioDao(gDao);
		dDao.insert(d);
		limparCampos();
	
	}
	private void alterarDados(DadosBancarios1 d)throws ClassNotFoundException,SQLException {
		GenericDao gDao = new GenericDao();
		DadosBancarioDao dDao =new DadosBancarioDao(gDao);
		dDao.atualizar(d);
		limparCampos();
		
	}

	private void excluirDados(DadosBancarios1 d) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		DadosBancarioDao dDao =new DadosBancarioDao(gDao);
		dDao.excluir(d);
		limparCampos();
		
	}

	private void buscarDados(DadosBancarios1 d) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		DadosBancarioDao dDao = new DadosBancarioDao(gDao);
		d = dDao.consultar(d);
		
		txagencia.setText(d.getAgencia());
		txbanco.setText(d.getBanco());
		
		txnometitular.setText(d.getNometitular());
		txnumconta.setText(d.getNumconta());
		txtipoconta.setText(d.getTipodeconta());
		txcnpj.setText(d.getCnpj());
	}

	private void listarDados() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		DadosBancarioDao dDao = new DadosBancarioDao(gDao);
		List <DadosBancarios1> dados =dDao.Listar();
		StringBuffer buffer = new StringBuffer();
		for (DadosBancarios1 d : dados) {
			buffer.append(d);
			buffer.append("\n");
		}
		
		
	}
	private void limparCampos() {
		
		txagencia.setText("");
		txbanco.setText("");
		txcnpj.setText("");
		txnometitular.setText("");
		txnumconta.setText("");
		txtipoconta.setText("");
		
	}
}