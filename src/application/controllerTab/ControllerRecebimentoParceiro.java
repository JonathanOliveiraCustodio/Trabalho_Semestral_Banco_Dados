package application.controllerTab;

import applicationcontroller.model.RecebimentoParceiroController;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ControllerRecebimentoParceiro {
	private TextArea tadadosbanco = new TextArea();
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addElemento(Tab tab) {
		
		Label lblsaldoDisponivel= new Label("Saldo Dísponivel:");
		Label lblsaldoliberar = new Label("Saldo a Liberar:");
		Label lblms1 = new Label("                 Realizar Transferência");
		Label lbltransferir = new Label("Informe o Valor que deseja Trasnferir: ");
		
		 lblms1.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	     lblms1.setTextFill(Color.BLACK);
		
	    
		lblsaldoDisponivel.setPrefWidth(100);
		lblsaldoliberar.setPrefWidth(100);
		lblms1.setPrefWidth(300);
		lbltransferir.setPrefWidth(220);
		
		TextField txid_dados = new TextField();
		TextField txsaldoDisponivel = new TextField();
		TextField txsaldoliberar = new TextField();
		TextField txtransferir = new TextField();
		
		
		txsaldoDisponivel.setPrefWidth(200);
		txsaldoDisponivel.setMaxWidth(200);
		txsaldoliberar.setPrefWidth(200);
		txsaldoliberar.setMaxWidth(200);
		txtransferir.setPrefWidth(150);
		txtransferir.setPrefWidth(150);
		
		
		tadadosbanco.setPrefWidth(300);
		tadadosbanco.setMaxWidth(300);
		tadadosbanco.setPrefHeight(50);
		tadadosbanco.setMaxHeight(50);
		
		Button bntbusca = new Button ("Buscar Conta");
		Button btnTransf = new Button("Transferir");
		btnTransf.setPrefWidth(100);
		bntbusca.setPrefWidth(100);
		
		EventHandler event = new RecebimentoParceiroController(tadadosbanco,txsaldoDisponivel,txsaldoliberar,txtransferir,txid_dados);
		bntbusca.setOnAction(event);
		btnTransf.setOnAction(event);
		
		
		HBox prilinha = new HBox(2);
		HBox seglinha = new HBox(2);
		HBox terlinha = new HBox(1);
		HBox qualinha = new HBox(2);
		HBox quilinha = new HBox(1);
		HBox sexlinha = new HBox(1);
		
		
		prilinha.getChildren().addAll(lblsaldoDisponivel, txsaldoDisponivel);
		seglinha.getChildren().addAll(lblsaldoliberar, txsaldoliberar);
		terlinha.getChildren().addAll(lblms1);
		qualinha.getChildren().addAll(lbltransferir,txtransferir);
		quilinha.getChildren().add(tadadosbanco);
		sexlinha.getChildren().addAll(bntbusca,btnTransf);
		
		VBox vbox = new VBox (6);
		Insets insert= new Insets(75,15,15,100);
		vbox.setPadding(insert);
		vbox.getChildren().addAll( prilinha,seglinha,terlinha,qualinha,quilinha,sexlinha);
		tab.setContent(vbox);
		
	}



}
