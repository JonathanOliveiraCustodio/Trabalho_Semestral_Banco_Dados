package application.controllerTab;

import application.TelaLogin;
import application.TelaLoginCliente;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerPrincipal {
	public void addTabElementos(Tab tab) {
		Label lblmsg = new Label ("Olá. Bem Vindo! . Escolha uma opção!");
		
		Button btncliente= new Button("Cliente");
		Button btnparceiro = new Button("Parceiro");
		
		btncliente.setPrefWidth(300);
		btncliente.setPrefHeight(100);
		btnparceiro.setPrefWidth(300);
		btnparceiro.setPrefHeight(100);
		
		HBox primeiralinha = new HBox(1); 
		HBox segundalinha = new HBox(2); 
		
		primeiralinha.getChildren().addAll(lblmsg);
		segundalinha.getChildren().addAll(btncliente, btnparceiro);
		
		btncliente.setOnMouseClicked(event -> {
        	abrircliente();
		});
		
		btnparceiro.setOnMouseClicked(event -> {
        	abrirparceiro();
		});
		
		
		
		VBox vbox = new VBox (4);
		Insets insert= new Insets(100,50,100,50);
		vbox.setPadding(insert);
		vbox.getChildren().addAll(primeiralinha,segundalinha);
		tab.setContent(vbox);
}

	private void abrirparceiro() {
		TelaLogin telaSecundaria = new TelaLogin();
        telaSecundaria.start(new Stage());
		
	}

	private void abrircliente() {
		TelaLoginCliente telaSecundaria = new TelaLoginCliente();
        telaSecundaria.start(new Stage());
		
	}
}