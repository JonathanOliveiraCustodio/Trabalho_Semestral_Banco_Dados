package application.controllerTab;

import applicationcontroller.model.ConsultaCliente;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControllerCompra {
private TextArea prod_tabela = new TextArea();
		
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addElemento(Tab tab) {
		Label lblprod = new Label ("Produtos");
		lblprod.setPrefWidth(200);
		
		 prod_tabela.setPrefWidth(700);
		 prod_tabela.setMaxWidth(700);
		 prod_tabela.setPrefHeight(400);
		 prod_tabela.setMaxHeight(400);
		 
		 Button bntpesq = new Button("Pesquisar Produtos");
		 bntpesq.setPrefWidth(150);
			bntpesq.setMaxWidth(200);
		 EventHandler event = new ConsultaCliente(prod_tabela);
			bntpesq.setOnAction(event);	 
		
		
		HBox prilinha = new HBox(2);
		HBox seglinha = new HBox(2);
		prilinha.setAlignment(Pos.CENTER);
		seglinha.setAlignment(Pos.CENTER);
		
		
		prilinha.getChildren().addAll(lblprod,bntpesq);
		seglinha.getChildren().addAll(prod_tabela);
		
		VBox vbox =new VBox(2);
		Insets insert = new Insets(25,5,5,25);
		vbox.setPadding(insert);
		vbox.getChildren().addAll(prilinha,seglinha);
		tab.setContent(vbox);
	}
}
