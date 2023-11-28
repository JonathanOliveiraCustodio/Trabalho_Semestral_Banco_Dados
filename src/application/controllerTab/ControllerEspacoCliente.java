package application.controllerTab;



import application.TelaCadastroCliente;
import application.TelaCarrinho;

import application.TelaCompraCLiente;
import application.TelaPesquisaProdutos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerEspacoCliente {
	public void addTabElementos(Tab tab) {
		Label lblmsg = new Label ("Olá. Este é seu espaço para realizr serviços refrentes a sua conta!");
		
		Button btndadospessoais = new Button("Meus dados pessoais");
		Button btncompras = new Button("Minhas compras");
		Button btncomprar = new Button ("Novas Compras");
		Button btncarrinho = new Button("Carrinho");
		
		btndadospessoais.setPrefWidth(300);
		btndadospessoais.setPrefHeight(100);
		btncompras.setPrefWidth(300);
		btncompras.setPrefHeight(100);
		btncomprar.setPrefWidth(300);
		btncomprar.setPrefHeight(100);
		btncarrinho.setPrefWidth(300);
		btncarrinho.setPrefHeight(100);
		
		HBox primeiralinha = new HBox(1); 
		HBox segundalinha = new HBox(2);
		HBox terlinha = new HBox(2);
		
		
		
		
		primeiralinha.getChildren().addAll(lblmsg);
		segundalinha.getChildren().addAll(btndadospessoais, btncompras);
		terlinha.getChildren().addAll(btncomprar,btncarrinho);
		
		btndadospessoais.setOnMouseClicked(event -> {
        	abrirDados();
		});
		
		btncompras.setOnMouseClicked(event -> {
        	abrirCompras();
		});
		btncomprar.setOnMouseClicked(event ->{
						AbrirnovaCompra();
				
		});
		btncarrinho.setOnMouseClicked(event ->{
			Abrircarrinho();
			
		});
		
		
		VBox vbox = new VBox (4);
		Insets insert= new Insets(100,50,100,50);
		vbox.setPadding(insert);
		vbox.getChildren().addAll(primeiralinha,segundalinha,terlinha);
		tab.setContent(vbox);
	}

	private void Abrircarrinho() {
		TelaCarrinho tela = new TelaCarrinho();
		tela.start(new Stage());
		
	}

	private void AbrirnovaCompra() {
		TelaPesquisaProdutos tela = new TelaPesquisaProdutos();
		tela.start(new Stage());
		
	}

	private void abrirCompras() {
		TelaCompraCLiente tela = new TelaCompraCLiente();
		tela.start(new Stage());
		
	}

	private void abrirDados() {
		TelaCadastroCliente tela = new TelaCadastroCliente();
		tela.start(new Stage());
		
	}
	
}
