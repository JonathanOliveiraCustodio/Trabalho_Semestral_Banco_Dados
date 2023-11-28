package application.controllerTab;

import applicationcontroller.model.CadastroParceiroController;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControllerManutencaoParceiro {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addElemento(Tab tab) {
		Label lblnome = new Label ("Nome do Responsável:");
		Label lblcnpj = new Label("Núnero de Inscrição (CNPJ):");
		Label lblsocial = new Label ("Razão Social: ");
		Label lblnomefant = new Label("Nome Fantasia: ");
		Label lblLogradouro = new Label("Logradouro:");
		Label lblcep = new Label("CEP:");
		Label lblcomplemento = new Label("Complemento:");
		Label lbltelefone = new Label("Telefone: ");
		Label lblemail = new Label("E-mail: ");
		Label lblconfEmail = new Label ("Confirme o E-mail:");
		Label lblsenha = new Label ("Senha:");
		Label lblconfsenha = new Label ("Confirma a Senha:");
		Label lblcodparc = new Label ("Código do Parceiro:");
		Label lbldataAb = new Label ("Data Abertura:");
		Label lblnum = new Label ("Número:");
		Label lblbairro = new Label ("Bairro:");
		
		lblnome.setPrefWidth(170);
		lblcnpj.setPrefWidth(170);
		lblsocial.setPrefWidth(170);
		lblnomefant.setPrefWidth(170);
		lblLogradouro.setPrefWidth(170);
		lblcep.setPrefWidth(170);
		lblcomplemento.setPrefWidth(170);
		lbltelefone.setPrefWidth(170);
		lblemail.setPrefWidth(170);
		lblconfEmail.setPrefWidth(170);
		lblsenha.setPrefWidth(170);
		lblconfsenha.setPrefWidth(170);
		lblcodparc.setPrefWidth(110);
		lbldataAb.setPrefWidth(110);
		lblnum.setPrefWidth(75);
		lblbairro.setPrefWidth(75);
		
		TextField txnomeparceiro = new TextField();
		TextField txcnpjparceiro = new TextField();
		TextField txsocialparceiro = new TextField();
		TextField txfantasiaparceiro = new TextField();
		TextField txlogradouroparceiro = new TextField();
		TextField txcepparceiro = new TextField();
		TextField txcomplementoparceiro = new TextField();
		TextField txtelefoneparceiro = new TextField();
		TextField txemailparceiro = new TextField();
		TextField txconfEmailparceiro = new TextField();
		TextField txsenhaparceiro = new TextField();
		TextField txconfsenhaparceiro = new TextField();
		TextField txcodparceiro = new TextField();
		TextField txdataAbertparceiro = new TextField();
		TextField txnumparceiro = new TextField();
		TextField txbairroparceiro = new TextField();
		
		txnomeparceiro.setPrefWidth(300);
		txcnpjparceiro.setPrefWidth(300);
		txsocialparceiro.setPrefWidth(300);
		txfantasiaparceiro.setPrefWidth(300);
		txlogradouroparceiro.setPrefWidth(300);
		txcepparceiro.setPrefWidth(120);
		txcomplementoparceiro.setPrefWidth(300);
		txtelefoneparceiro.setPrefWidth(100);
		txemailparceiro.setPrefWidth(200);
		txconfEmailparceiro.setPrefWidth(200);
		txsenhaparceiro.setPrefWidth(120);
		txconfsenhaparceiro.setPrefWidth(120);
		txcodparceiro.setPrefWidth(75);
		txdataAbertparceiro.setPrefWidth(75);
		txnumparceiro.setPrefWidth(75);
		txbairroparceiro.setPrefWidth(200);
		
		txnomeparceiro.setMaxWidth(400);
		txcnpjparceiro.setMaxWidth(400);
		txsocialparceiro.setMaxWidth(400);
		txfantasiaparceiro.setMaxWidth(400);
		txlogradouroparceiro.setMaxWidth(400);
		txcepparceiro.setMaxWidth(400);
		txcomplementoparceiro.setMaxWidth(400);
		txtelefoneparceiro.setMaxWidth(400);
		txemailparceiro.setMaxWidth(400);
		txconfEmailparceiro.setMaxWidth(400);
		txsenhaparceiro.setMaxWidth(400);
		txconfsenhaparceiro.setMaxWidth(400);
		txcodparceiro.setMaxWidth(400);
		txdataAbertparceiro.setMaxWidth(400);
		txnumparceiro.setMaxWidth(100);
		txbairroparceiro.setMaxWidth(400);
		
		Button btnsalva = new Button("Cadastrar");
		Button btnedita = new Button("Editar Cadastro");
		Button btnbuscar = new Button("Buscar");
		btnbuscar.setPrefWidth(100);
		btnsalva.setPrefWidth(100);
		btnedita.setPrefWidth(100);
		
		EventHandler event = new CadastroParceiroController(txnomeparceiro, txcnpjparceiro, txsocialparceiro, txfantasiaparceiro, txlogradouroparceiro, txcepparceiro, txcomplementoparceiro, txtelefoneparceiro, txemailparceiro, txconfEmailparceiro, txsenhaparceiro, txconfsenhaparceiro, txcodparceiro, txdataAbertparceiro, txnumparceiro, txbairroparceiro);
		btnsalva.setOnAction(event);
		btnedita.setOnAction(event);
		btnbuscar.setOnAction(event);
		
		HBox prilinha = new HBox(4);
		HBox seglinha = new HBox(4);
		HBox terlinha = new HBox(2);
		HBox qualinha = new HBox(2);
		HBox quilinha = new HBox(4);
		HBox sexlinha = new HBox(4);
		HBox setlinha = new HBox(2);
		HBox oitlinha = new HBox(2);
		HBox nonlinha = new HBox(2);
		HBox declinha = new HBox(2);
		HBox elelinha = new HBox(2);
		HBox twelinha = new HBox(2);
		HBox thelinha = new HBox(2);
		
		prilinha.getChildren().addAll(lblnome,txnomeparceiro, lblcodparc,txcodparceiro);
		seglinha.getChildren().addAll(lblcnpj,txcnpjparceiro, lbldataAb,txdataAbertparceiro);
		terlinha.getChildren().addAll(lblsocial,txsocialparceiro );
		qualinha.getChildren().addAll(lblnomefant,txfantasiaparceiro);
		quilinha.getChildren().addAll(lblLogradouro,txlogradouroparceiro, lblnum,txnumparceiro);
		sexlinha.getChildren().addAll(lblcep, txcepparceiro, lblbairro,txbairroparceiro);
		setlinha.getChildren().addAll(lblcomplemento, txcomplementoparceiro);
		oitlinha.getChildren().addAll(lbltelefone, txtelefoneparceiro);
		nonlinha.getChildren().addAll(lblemail, txemailparceiro);
		declinha.getChildren().addAll(lblconfEmail, txconfEmailparceiro);
		elelinha.getChildren().addAll(lblsenha, txsenhaparceiro);
		twelinha.getChildren().addAll(lblconfsenha,txconfsenhaparceiro);
		thelinha.getChildren().addAll( btnsalva,btnbuscar ,btnedita);
		
		VBox vbox = new VBox (13);
		Insets insert= new Insets(25,5,5,25);
		vbox.setPadding(insert);
		vbox.getChildren().addAll(prilinha,seglinha,terlinha,qualinha,quilinha,sexlinha,setlinha,oitlinha,nonlinha,declinha, elelinha,twelinha,thelinha);
		tab.setContent(vbox);
}
}
