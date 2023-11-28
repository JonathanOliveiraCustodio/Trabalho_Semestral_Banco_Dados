package application.controllerTab;


import applicationcontroller.model.VisualizacaoProdutoController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class ControllerVisualizacaoProduto {

	ObservableList<String> itens = FXCollections.observableArrayList("Masculino", "Feminino", "Unissex");

	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public void addElemento(Tab tab) {
		
		Label lblnomeProd = new Label("Nome do Produto: ");
		Label lblcodigo = new Label("Código:");
		Label lblDescricao = new Label("Descrição");
		Label lblGenero = new Label("Gênero:");
		Label lblMaterial = new Label("Material:");
		Label lblComposicao = new Label("Composição:");
		Label lblOrigem = new Label("Origem:");
		Label lblIndicado = new Label("Indicado para:");
		Label lblCategoria = new Label("Categoria:");
		Label lblTamanho = new Label("Tamanho:");
		Label lblPreco = new Label("R$ ");
		Label lblCor = new Label("Cor: ");
		Label lblQtdCompra = new Label("Quantidade: ");
		Label lblCalcularFrete = new Label("Calcular Frete: ");
		
		
		Label lblFichaTecnica = new Label("Ficha Técnica");
		lblFichaTecnica.setStyle("-fx-text-fill: black; -fx-font-family: 'Arial'; -fx-font-size: 16px;");
		lblnomeProd.setPrefWidth(170);
		lblcodigo.setPrefWidth(80);
		lblDescricao.setPrefWidth(170);
		lblDescricao.setStyle("-fx-text-fill: black; -fx-font-family: 'Arial'; -fx-font-size: 16px;");
		lblTamanho.setStyle("-fx-text-fill: black; -fx-font-family: 'Arial'; -fx-font-size: 16px;");
		lblCor.setPrefWidth(105);
		lblFichaTecnica.setPrefWidth(170);

		
		
		Label lblDNomeProduto = new Label("Este Texto será Substituido pelo nome do Produto ");
		
		Label lblDDescricao = new Label("Descrição Estilo esportivo renovado com o Tenis Nike Air Max Masculino! "
				+ "O cabedal em sintético fornece resistência e durabilidade, enquanto a entressola com a "
				+ "tecnologia Air Max apresenta amortecimento suave\r\n"
				+ "durante o dia a dia. O design esportivo dá o diferencial da peça. Adquira já esse tênis Nike masculino!");
		Label lblDCodigo = new Label();
		Label lblDMaterial = new Label("Couro Sintetico");
		Label lblDComposicao = new Label("Elastano");
		Label lblDGenero = new Label("Masculino");
		Label lblDOrigem = new Label("Indonesia");
		Label lblDindicado = new Label("Dia-a-dia");
		Label lblDMarca = new Label("Nike");
		Label lblDCategoria = new Label("Esporte");
		Label lblDQuantidade = new Label("200");
		Label lblDTamanho = new Label("38");
		Label lblDCor = new Label("Azul/Preto");
		Label lblDPreco = new Label("350.00");
		TextField txtQtdCompra = new TextField("1");
		TextField txtCalcularFrete = new TextField("00000-000");

		lblDNomeProduto.setStyle("-fx-text-fill: green; -fx-font-family: 'Arial'; -fx-font-size: 20px;");
		lblDPreco.setStyle("-fx-text-fill: green; -fx-font-family: 'Arial'; -fx-font-size: 16px;");
		lblPreco.setStyle("-fx-text-fill: green; -fx-font-family: 'Arial'; -fx-font-size: 16px;");
		
		lblDCodigo.setPrefWidth(100);
		lblDCodigo.setMaxWidth(100);
		
		lblDDescricao.setPrefWidth(600);
		lblDDescricao.setMaxWidth(700);
		lblDDescricao.setPrefHeight(100);
		
		lblCalcularFrete.setPrefWidth(400);
		lblCalcularFrete.setMaxWidth(300);
		
		
		lblDMaterial.setPrefWidth(300);
		lblDMaterial.setMaxWidth(400);		
		lblDComposicao.setPrefWidth(300);
		lblDComposicao.setMaxWidth(400);		
		lblDOrigem.setPrefWidth(300);
		lblDOrigem.setMaxWidth(400);		
		lblDindicado.setPrefWidth(300);
		lblDindicado.setMaxWidth(400);
		lblDMarca.setPrefWidth(300);
		lblDMarca.setMaxWidth(400);
		lblDCategoria.setPrefWidth(300);
		lblDCategoria.setMaxWidth(400);
		lblDTamanho.setPrefWidth(300);
		lblDTamanho.setMaxWidth(400);
		lblDQuantidade.setPrefWidth(300);
		lblDQuantidade.setMaxWidth(400);
		lblDCor.setPrefWidth(300);
		lblDCor.setMaxWidth(400);
		lblDPreco.setPrefWidth(300);
		lblDPreco.setMaxWidth(400);

	
		Button btnAdicionar = new Button("Adicionar");
		Button btnComprar = new Button("Comprar");
		Button btnVisualizar = new Button("Visualizar");

	
		EventHandler event = new VisualizacaoProdutoController(lblDNomeProduto,lblDCodigo, lblDDescricao, lblDMaterial, 
				lblDComposicao, lblDGenero, lblDOrigem, lblDindicado, lblDMarca, lblDCategoria, lblDQuantidade, lblDTamanho, lblDCor, lblDPreco);
		btnAdicionar.setOnAction(event);
		btnComprar.setOnAction(event);
		btnVisualizar.setOnAction(event);
		
		btnAdicionar.setPrefWidth(75);
		btnComprar.setPrefWidth(75);
		
		HBox linha1 = new HBox(1);
		HBox linha2 = new HBox(3);
		HBox linha3 = new HBox(1);
		HBox linha4 = new HBox(1);
		HBox linha5 = new HBox(4);
		HBox linha6 = new HBox(4);
		HBox linha7 = new HBox(3);
		HBox linha8 = new HBox(4);
		HBox linha9 = new HBox(2);
		HBox linha10 = new HBox(2);
		HBox linha11 = new HBox(2);
		HBox linha12 = new HBox(2);
		HBox linha13 = new HBox(2);
		
		linha1.setAlignment(Pos.TOP_CENTER);
		linha2.setAlignment(Pos.TOP_RIGHT);
		linha6.setAlignment(Pos.BASELINE_LEFT);
		linha8.setAlignment(Pos.BASELINE_LEFT);
		linha9.setAlignment(Pos.BASELINE_LEFT);
		linha10.setAlignment(Pos.BASELINE_LEFT);
		linha11.setAlignment(Pos.BASELINE_LEFT);
		linha12.setAlignment(Pos.BASELINE_LEFT);
		linha13.setAlignment(Pos.BASELINE_LEFT);
		
		linha1.getChildren().addAll(lblDNomeProduto);
		linha2.getChildren().addAll(btnVisualizar,btnAdicionar, btnComprar);
		linha3.getChildren().addAll(lblDescricao);
		linha4.getChildren().addAll(lblDDescricao);
		linha5.getChildren().addAll(lblTamanho);
		linha6.getChildren().addAll(lblCor,lblDCor,lblQtdCompra,txtQtdCompra);
		linha7.getChildren().addAll(lblFichaTecnica,lblCalcularFrete,txtCalcularFrete);
		linha8.getChildren().addAll(lblCategoria, lblDCategoria,lblPreco,lblDPreco);
		linha9.getChildren().addAll(lblMaterial,lblDMaterial);
		linha10.getChildren().addAll(lblGenero,lblDGenero);
		linha11.getChildren().addAll(lblOrigem,lblDOrigem);
		linha12.getChildren().addAll(lblComposicao,lblDComposicao);
		linha13.getChildren().addAll(lblIndicado,lblDindicado);

	

		VBox vbox = new VBox(13);
		Insets insert = new Insets(25, 5, 5, 25);
		vbox.setPadding(insert);
		vbox.getChildren().addAll(linha1, linha2, linha3, linha4, linha5, linha6, linha7, linha8,
				linha9, linha10, linha11, linha12,linha13);
		tab.setContent(vbox);

	}
	

}
