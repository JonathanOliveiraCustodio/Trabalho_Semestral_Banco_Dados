package application.controllerTab;



import application.TelaClienteProduto;
import application.TelaDadosBancario;
import application.TelaManutencaoParceiro;
import application.TelaProdutoParceiro;
import application.TelaRecebimentoParceiro;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerEspacoParceiro {
	public void addElemento(Tab tab) {
		Label lblmsg = new Label ("Olá. Este é seu espaço para realizr serviços refrentes a sua loja!");
		
		lblmsg.setPrefWidth(400);
		Button bntdadospessoais = new Button("Meus Dados Pessoais");
		Button bntdadosbancario = new Button("Meus Dados Bancarios");
		Button bntvendas = new Button("Vendas");
		Button bntrecebimentos = new Button("Recebimentos ");
		Button bntproduto = new Button("Produtos");
		Button bntestat = new Button("Estatística");
		
		bntdadospessoais .setPrefWidth(300) ;
		bntdadospessoais.setPrefHeight(100);
		bntdadosbancario .setPrefWidth(300) ;
		bntdadosbancario.setPrefHeight(100);
		bntvendas .setPrefWidth(300) ;
		bntvendas.setPrefHeight(100);
		bntrecebimentos .setPrefWidth(300) ;
		bntrecebimentos.setPrefHeight(100);
		bntproduto .setPrefWidth(300) ;
		bntproduto.setPrefHeight(100);
		bntestat .setPrefWidth(300) ;
		bntestat.setPrefHeight(100);
		
		HBox prilinha =new HBox(1);
		HBox seglinha =new HBox(2);
		HBox terlinha =new HBox(2);
		HBox qualinha =new HBox(2);
		HBox quilinha =new HBox(2);
		
		prilinha.getChildren().addAll(lblmsg);
		seglinha.getChildren().addAll(bntdadospessoais, bntdadosbancario);
		terlinha.getChildren().addAll(bntvendas,bntrecebimentos);
		qualinha.getChildren().addAll(bntproduto,bntestat);
		
		bntdadospessoais.setOnMouseClicked(event -> {
        	abrirDados();
		});
		bntvendas.setOnMouseClicked(event -> {
        	abrirVendas();
		});
		bntdadosbancario.setOnMouseClicked(event -> {
        	abrirDadosBanco();
		});
		
		bntproduto.setOnMouseClicked(event -> {
        	abrirproduto();
		});
		
		bntrecebimentos.setOnMouseClicked(event -> {
        	abrirRecebimentos();
		});
		
		VBox vbox = new VBox (4);
		Insets insert= new Insets(75,10,10,70);
		vbox.setPadding(insert);
		vbox.getChildren().addAll(prilinha,seglinha,terlinha,qualinha,quilinha);
		tab.setContent(vbox);
	
}

	private void abrirVendas() {
		TelaClienteProduto tela = new TelaClienteProduto();
		tela.start(new Stage());
	}

	private void abrirRecebimentos() {
		TelaRecebimentoParceiro tela = new TelaRecebimentoParceiro();
		tela.start(new Stage());
		
	}

	private void abrirDados() {
		 TelaManutencaoParceiro telaSecundaria = new TelaManutencaoParceiro();
	        telaSecundaria.start(new Stage());
		
	}
	private void abrirDadosBanco() {
		 TelaDadosBancario telaSecundaria = new TelaDadosBancario();
	        telaSecundaria.start(new Stage());
	}
	private void abrirproduto() {
		 TelaProdutoParceiro telaSecundaria = new TelaProdutoParceiro();
	        telaSecundaria.start(new Stage());
	}
}
