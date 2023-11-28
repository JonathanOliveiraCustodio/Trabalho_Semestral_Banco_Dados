package applicationcontroller.model;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

import application.model.CadastroProdutoParceiro;
import application.persitencia.CadastroProdutoParceiroDao;
import application.persitencia.GenericDao;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class ProdutoParceiroController implements EventHandler<Event>{
	
	private TextField txnomeProd;
	private TextField txcodigo;
	private TextField txdesc;
	private ComboBox<String> combgenero;
	private TextField txmaterial;
	private TextField txcomposicao;
	private TextField txorigem; 
	private TextField txindicado;
	private TextField txmarca;
	private TextField txcategoria;
	private TextField txtqtdEstoque;
	private TextField txtamanho;
	private TextField txcor;
	private TextField txpreco;
	private TextArea taListaProdutos;
	
	
	
	public ProdutoParceiroController(TextField txnomeProd, TextField txcodigo, TextField txdesc,
			ComboBox<String> combgenero, TextField txmaterial, TextField txcomposicao, TextField txorigem,
			TextField txindicado, TextField txmarca, TextField txcategoria, TextField txtqtdEstoque,
			TextField txtamanho, TextField txcor, TextField txpreco, TextArea taListaProdutos) {
		super();
		this.txnomeProd = txnomeProd;
		this.txcodigo = txcodigo;
		this.txdesc = txdesc;
		this.combgenero = combgenero;
		this.txmaterial = txmaterial;
		this.txcomposicao = txcomposicao;
		this.txorigem = txorigem;
		this.txindicado = txindicado;
		this.txmarca = txmarca;
		this.txcategoria = txcategoria;
		this.txtqtdEstoque = txtqtdEstoque;
		this.txtamanho = txtamanho;
		this.txcor = txcor;
		this.txpreco = txpreco;
		this.taListaProdutos = taListaProdutos;
	}

	

	@Override
	public void handle(Event event) {
		String cmd = event.getSource().toString();
		CadastroProdutoParceiro pp = new CadastroProdutoParceiro();
		if(!cmd.contains("Listar")) {
			pp.setCodProduto(Integer.parseInt(txcodigo.getText()));
		}
		if(cmd.contains("Salvar")||cmd.contains("Editar")) {
			pp.setCodProduto(Integer.parseInt(txcodigo.getText()));
			pp.setNomeProduto(txnomeProd.getText());
			pp.setDescricao(txcodigo.getText());
			pp.setGenero(combgenero.getValue());
			pp.setMaterial(txmaterial.getText());
			pp.setComposicao(txcomposicao.getText());
			pp.setOrigem(txorigem.getText());
			pp.setIndicacao(txindicado.getText());
			pp.setMarca(txmarca.getText());
			pp.setCategoria(txcategoria.getText());
			pp.setTamanho(Integer.parseInt(txtamanho.getText()));
		    pp.setQtdEstoque(Integer.parseInt(txtqtdEstoque.getText()));
		    pp.setCor(txcor.getText());
		    pp.setPrecoVenda(Float.parseFloat(txpreco.getText()));
	
		}
		try {
			if (cmd.contains("Salvar")) {
				cadastrarProduto(pp);
			} else if (cmd.contains("Editar")) {
				alterarProduto(pp);
			} else if (cmd.contains("Excluir")) {
				excluirProduto(pp);
			}else if (cmd.contains("Buscar")) {
				buscarProduto(pp);
			} else if (cmd.contains("Listar")) {
				listarProdutos();
			} else if (cmd.contains("Excluir")) {
				excluirProduto(pp);	
			}
		} catch (SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
		}
		
	}

	
	private void cadastrarProduto(CadastroProdutoParceiro pp) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroProdutoParceiroDao ppDao = new CadastroProdutoParceiroDao(gDao);
		ppDao.insert(pp);
		limparCampos();
		listarProdutos();		
	}

	private void alterarProduto(CadastroProdutoParceiro pp) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroProdutoParceiroDao ppDao = new CadastroProdutoParceiroDao(gDao);
		ppDao.atualizar(pp);
		limparCampos();
		listarProdutos();
		
	}

	private void excluirProduto(CadastroProdutoParceiro pp) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroProdutoParceiroDao ppDao = new CadastroProdutoParceiroDao(gDao);
		ppDao.excluir(pp);
		limparCampos();
		listarProdutos();
		
	}

	private void buscarProduto(CadastroProdutoParceiro pp) throws ClassNotFoundException, SQLException {	
		GenericDao gDao = new GenericDao();
		CadastroProdutoParceiroDao ppDao = new CadastroProdutoParceiroDao(gDao);
		pp = ppDao.consultar(pp);		
		txcodigo.setText(String.valueOf(pp.getCodProduto()));
		txnomeProd.setText(String.valueOf(pp.getNomeProduto()));	
		txdesc.setText(String.valueOf(pp.getDescricao()));
		combgenero.setValue(String.valueOf(pp.getGenero()));
		txmaterial.setText(String.valueOf(pp.getMaterial()));
		txcomposicao.setText(String.valueOf(pp.getComposicao()));
		txorigem.setText(String.valueOf(pp.getOrigem()));
		txindicado.setText(String.valueOf(pp.getIndicacao()));
		txmarca.setText(String.valueOf(pp.getMarca()));
		txcategoria.setText(String.valueOf(pp.getCategoria()));
		txtqtdEstoque.setText(String.valueOf(pp.getQtdEstoque()));
		txtamanho.setText(String.valueOf(pp.getTamanho()));
		txcor.setText(String.valueOf(pp.getCor()));
		txpreco.setText(String.valueOf(pp.getPrecoVenda()));
	}

	private void listarProdutos() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		CadastroProdutoParceiroDao ppDao = new CadastroProdutoParceiroDao(gDao);
	    List<CadastroProdutoParceiro> produtos = ppDao.Listar();

	    StringBuffer buffer = new StringBuffer();
	    for (CadastroProdutoParceiro p : produtos) {
	        buffer.append(p);
	        buffer.append("\n");
	    }
	    taListaProdutos.setText(buffer.toString());
	    limparCampos();	

	}

	private void limparCampos() {
		txnomeProd.setText("");
		txcodigo.setText("");
		txdesc.setText("");
		combgenero.setValue(null);
		txmaterial.setText("");
		txcomposicao.setText("");
		txorigem.setText("");
		txindicado.setText("");
		txmarca.setText("");
		txcategoria.setText("");
		txtqtdEstoque.setText("");
		txtamanho.setText("");
		txcor.setText("");
		txpreco.setText("");
	}	
}

