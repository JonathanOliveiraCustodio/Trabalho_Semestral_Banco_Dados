package application.controllerTab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class ControllerPagamentoCliente {
	ObservableList<String> mes = FXCollections.observableArrayList(
			 "Janeiro", "Fevereiro", "Março","Abril","Maio","Junho","Julho","Agosto",
			 "Setembro","Outubro","Novenbro","Dezembro");
	ObservableList<String> ano = FXCollections.observableArrayList(
			"2023","2024","2025","2026","2027","2028","2029","2030");
	ObservableList<String> parcelas = FXCollections.observableArrayList(
	" 1x sem juros "," 2x  sem juros"," 3x  sem juros "," 4x  sem juros "," 5x  sem juros");
	ComboBox<String> Combmes = new ComboBox<>(mes);
	ComboBox<String> combano = new ComboBox<>(ano);
	ComboBox<String> combparcelas = new ComboBox<>(parcelas);
	private TextArea tabelapagamento = new TextArea();
	
	public void addElemento(Tab tab ) {
		Label lblNumeroPedido = new Label("Número do Pedido");
		Label lblnumCartao  = new Label("Número do Cartão");
		Label lblNome  = new Label("Nome Impresso no Cartão");
		Label lblvalidade  = new Label("Validade");
		Label lblcvc  = new Label("CVC");
		Label lblmsg  = new Label("Código de 3 números no verso do cartão");
		Label lblparcelamento  = new Label("Parcelamento");
		Label lbltotal = new Label("Total");
		Label lblmgs2 = new Label("Escolha a Forma de Pagamento");
		
		lblnumCartao .setPrefWidth(150);
		lblNome .setPrefWidth(150);
		lblvalidade .setPrefWidth(150);
		lblcvc .setPrefWidth(150);
		lblmsg .setPrefWidth(300);
		lblparcelamento .setPrefWidth(150);
		lbltotal .setPrefWidth(150);
		lblmgs2.setPrefWidth(400);
		lblNumeroPedido.setPrefWidth(150);
     
        TextField txnumCartao = new TextField();
        TextField txNome = new TextField();
        TextField txcvc = new TextField();
        TextField txnumpedido = new TextField();
        TextField txTotal =new TextField();
        
        combano.setPrefWidth(100);
		combano.setMaxWidth(200);
        
		Combmes.setPrefWidth(100);
		Combmes.setMaxWidth(300);
		
		combparcelas.setPrefWidth(150);
		combparcelas.setMaxWidth(200);
        
		txNome.setPrefWidth(400);
		txNome.setMaxWidth(500); 
		txnumCartao.setPrefWidth(100);
		txnumCartao.setMaxWidth(100);
		txcvc.setPrefWidth(50);
		txcvc.setMaxWidth(50); 
		txnumpedido.setPrefWidth(100);
		txnumpedido.setMaxWidth(100);
		txTotal.setPrefWidth(100);
		txTotal.setMaxWidth(100);
		
		tabelapagamento.setPrefWidth(800);
		 tabelapagamento.setMaxWidth(800);
		 tabelapagamento.setPrefHeight(100);
		 tabelapagamento.setMaxHeight(100);
		 
		 Button bntFinalizar = new Button("Finalizar");
		 bntFinalizar.setPrefWidth(100);
		 bntFinalizar.setMaxWidth(100);
		 
		 Button bntcart = new Button("Cartão");
		 bntFinalizar.setPrefWidth(100);
		 bntFinalizar.setMaxWidth(100);
		 
		 Button bntBoleto = new Button("Boleto");
		 bntFinalizar.setPrefWidth(100);
		 bntFinalizar.setMaxWidth(100);
		 
		 Button bntPix = new Button("Pix");
		 bntFinalizar.setPrefWidth(100);
		 bntFinalizar.setMaxWidth(100);
		 
		 	HBox zerlinha = new HBox(1);
			HBox prilinha = new HBox(2);
			HBox seglinha = new HBox(1);
			HBox terlinha = new HBox(1);
			HBox qualinha = new HBox(2);
			HBox quilinha = new HBox(2);
			HBox sexlinha = new HBox(3);
			HBox setlinha = new HBox(3);
			HBox oitlinha = new HBox(1);
			HBox nonlinha = new HBox(1);
			HBox declinha = new HBox(2);
			HBox elelinha = new HBox(1);
			HBox twelinha = new HBox(1);
			
			prilinha.setAlignment(Pos.BASELINE_RIGHT);
			seglinha.setAlignment(Pos.CENTER);
			declinha.setAlignment(Pos.BASELINE_RIGHT);
			elelinha.setAlignment(Pos.BASELINE_RIGHT);
			
			zerlinha.getChildren().addAll(bntcart);
			prilinha.getChildren().addAll(lblNumeroPedido,txnumpedido);
			seglinha.getChildren().addAll(lblmgs2);
			terlinha.getChildren().addAll(lblnumCartao,txnumCartao);
			qualinha.getChildren().addAll(lblNome,txNome);
			quilinha.getChildren().addAll(lblvalidade,Combmes,combano);
			sexlinha.getChildren().addAll(lblcvc, txcvc, lblmsg);
			setlinha.getChildren().addAll(lblparcelamento, combparcelas);
			oitlinha.getChildren().addAll(bntBoleto);
			nonlinha.getChildren().addAll(bntPix);
			declinha.getChildren().addAll(lbltotal ,txTotal);
			elelinha.getChildren().addAll(bntFinalizar);
			twelinha.getChildren().addAll(tabelapagamento);
			VBox vbox = new VBox (13);
			Insets insert= new Insets(25,5,5,25);
			vbox.setPadding(insert);
			vbox.getChildren().addAll(prilinha,seglinha,zerlinha,terlinha,qualinha,quilinha,sexlinha,setlinha,oitlinha,nonlinha,declinha, elelinha,twelinha);
			tab.setContent(vbox);
        
	}
}
