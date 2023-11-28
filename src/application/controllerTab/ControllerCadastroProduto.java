package application.controllerTab;


import applicationcontroller.model.ProdutoParceiroController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControllerCadastroProduto {
	
	ObservableList<String> itens = FXCollections.observableArrayList(
            "Masculino", "Feminino", "Unissex");

    ComboBox<String> combgenero = new ComboBox<>(itens);
    
	private TextArea tabelaCadastro = new TextArea();	

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addElemento(Tab tab ) {
		Label lblnomeProd = new Label("Nome do Produto: ");
		Label lblcodigo = new Label(" Código:");
		Label lbldescr = new Label("Descrição:");
		Label lblgenero = new Label("Gênero:");
		Label lblmaterial = new Label("Material:");
		Label lblcomposicao = new Label("Composição:");
		Label lblorigem = new Label("Origem:");
		Label lblindicado = new Label("Indicado para:");
		Label lblcategoria = new Label("Categoria:");
		Label lblmarca = new Label("Marca:");
		Label lblquantidade = new Label("Quantidade em Estoque:");
		Label lbltamanho = new Label("Tamanho:");
		Label lblpreco = new Label("Preço de Venda:");
		Label lblcor = new Label("Cor:  ");
		Label lblimagem = new Label ("Imagens:");
		                      
		 lblnomeProd .setPrefWidth(170);
		 lblcodigo .setPrefWidth(80);
		 lbldescr .setPrefWidth(170);
		 lblgenero .setPrefWidth(170);
		 lblmaterial .setPrefWidth(100);
		 lblcomposicao .setPrefWidth(170);
		 lblorigem .setPrefWidth(100);
		 lblindicado .setPrefWidth(170);
		 lblmarca .setPrefWidth(100);
		 lblcategoria .setPrefWidth(170);
		 lblquantidade .setPrefWidth(170);
		 lbltamanho .setPrefWidth(100);
		 lblcor .setPrefWidth(105);
		 lblimagem .setPrefWidth(170);
		 lblpreco.setPrefWidth(170);
		 
		 TextField txnomeProd  = new TextField();
		 TextField txcodigo   = new TextField();
		 TextField txdesc  = new TextField();
		 TextField txmaterial  = new TextField();
		 TextField txcomposicao  = new TextField();
		 TextField txorigem  = new TextField();
		 TextField txindicado  = new TextField();
		 TextField txmarca  = new TextField();
		 TextField txcategoria  = new TextField();
		 TextField txquantidade  = new TextField();
		 TextField txtamanho  = new TextField();
		 TextField txcor  = new TextField();
		 TextField txpreco  = new TextField();
		 
		 combgenero.setPrefWidth(300);
		 combgenero.setMaxWidth(400);
		 
		 txnomeProd.setPrefWidth(400);
		 txnomeProd.setMaxWidth(500);
		 txcodigo.setPrefWidth(100);
		 txcodigo.setMaxWidth(100);
		 txdesc.setPrefWidth(600);
		 txdesc.setMaxWidth(700);
		 txdesc.setPrefHeight(100);
		 txdesc.setMaxHeight(100);
		
		 txmaterial.setPrefWidth(200);
		 txmaterial.setMaxWidth(400);
		 txcomposicao.setPrefWidth(300);
		 txcomposicao.setMaxWidth(400);
		 txorigem.setPrefWidth(200);
		 txorigem.setMaxWidth(400);
		 txindicado.setPrefWidth(300);
		 txindicado.setMaxWidth(400);
		 txmarca.setPrefWidth(200);
		 txmarca.setMaxWidth(400);
		 txcategoria.setPrefWidth(300);
		 txcategoria.setMaxWidth(400);
		 txtamanho.setPrefWidth(200);
		 txtamanho.setMaxWidth(400);
		 txquantidade.setPrefWidth(300);
		 txquantidade.setMaxWidth(400);
		 txcor.setPrefWidth(200);
		 txcor.setMaxWidth(400);
		 txpreco.setPrefWidth(300);
		 txpreco.setMaxWidth(400);
		 
		 tabelaCadastro.setPrefWidth(800);
		 tabelaCadastro.setMaxWidth(800);
		 tabelaCadastro.setPrefHeight(100);
		 tabelaCadastro.setMaxHeight(100);
		 
		 Button bntsalva = new Button("Salvar");
		 Button bntedita = new Button("Editar");
		 Button bntbuscar = new Button("Buscar");
		 Button bntListar =new Button ("Listar");
		 Button btnimagem = new Button ("Carregar imagem");
		 Button btnexcluir = new Button ("Excluir");
		 
		 bntsalva.setPrefWidth(75);
		 bntedita.setPrefWidth(75);
	     bntbuscar.setPrefWidth(75);
	     bntListar.setPrefWidth(75);
	     bntListar.setMaxWidth(75);
	     btnexcluir.setMaxWidth(75);
		 btnimagem.setMaxWidth(150);
		 
		 EventHandler event =new ProdutoParceiroController(txnomeProd, txcodigo, txdesc, combgenero, txmaterial, txcomposicao, txorigem, txindicado, txmarca, txcategoria, txquantidade, txtamanho, txcor, txpreco,tabelaCadastro);
		 bntsalva.setOnAction(event);
		 bntedita.setOnAction(event);
		 bntbuscar.setOnAction(event);
		 bntListar.setOnAction(event);
		 btnexcluir.setOnAction(event);
		 
		 
		 
			HBox prilinha = new HBox(4);
			HBox seglinha = new HBox(2);
			HBox terlinha = new HBox(4);
			HBox qualinha = new HBox(4);
			HBox quilinha = new HBox(4);
			HBox sexlinha = new HBox(4);
			HBox setlinha = new HBox(4);
			HBox oitlinha = new HBox(2);
			HBox nonlinha = new HBox(4);
			HBox declinha = new HBox(1);
			HBox elelinha = new HBox(1);
			HBox twelinha = new HBox(3);
			twelinha.setAlignment(Pos.CENTER);
			
			
			prilinha.getChildren().addAll(lblnomeProd,txnomeProd,lblcodigo,txcodigo);
			seglinha.getChildren().addAll(lbldescr, txdesc);
			terlinha.getChildren().addAll(lblgenero,combgenero,lblmaterial, txmaterial);
			qualinha.getChildren().addAll(lblcomposicao,txcomposicao);
			quilinha.getChildren().addAll(lblcomposicao,txcomposicao, lblorigem,txorigem);
			sexlinha.getChildren().addAll(lblindicado, txindicado, lblmarca,txmarca);
			setlinha.getChildren().addAll(lblcategoria, txcategoria, lbltamanho, txtamanho);
			oitlinha.getChildren().addAll(lblquantidade, txquantidade, lblcor,txcor);
			nonlinha.getChildren().addAll(lblpreco, txpreco);
			declinha.getChildren().addAll(lblimagem, btnimagem);
			elelinha.getChildren().addAll(tabelaCadastro);
			twelinha.getChildren().addAll(bntsalva,bntedita,bntbuscar,bntListar,btnexcluir);
			
			VBox vbox = new VBox (13);
			Insets insert= new Insets(25,5,5,25);
			vbox.setPadding(insert);
			vbox.getChildren().addAll(prilinha,seglinha,terlinha,qualinha,quilinha,sexlinha,setlinha,oitlinha,nonlinha,declinha, elelinha,twelinha);
			tab.setContent(vbox);
			
			
		 
		 
	}
}
