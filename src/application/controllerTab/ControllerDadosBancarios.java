package application.controllerTab;

import applicationcontroller.model.DadosBancarioController;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControllerDadosBancarios {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addElemento(Tab tab) {
		
		
		Label lblbanco =new Label("Banco ou Instituição:");
		Label lblagencia =new Label("Agência:");
		Label lblnumconta =new Label("Número da Conta:");
		Label lbltipoconta =new Label("Tipo da Conta:");
		Label lblnometitular =new Label("Nome Completo do Titular");
		Label lblcnpj =new Label("CNPJ:");
		
		
		lblbanco .setPrefWidth(170);
		lblagencia .setPrefWidth(170);
		lblnumconta .setPrefWidth(170);
		lbltipoconta .setPrefWidth(170);
		lblnometitular .setPrefWidth(170);
		lblcnpj .setPrefWidth(170);
	
		
		TextField txbanco =new TextField();
		TextField txagencia =new TextField();
		TextField txnumconta =new TextField();
		TextField txtipoconta =new TextField();
		TextField txnometitular =new TextField();
		TextField txcnpj =new TextField();
		
		
		txbanco .setPrefWidth(200);
		txagencia .setPrefWidth(200);
		txnumconta .setPrefWidth(170);
		txtipoconta .setPrefWidth(100);
		txnometitular .setPrefWidth(200);
		txcnpj .setPrefWidth(100);
		
		
		txbanco .setMaxWidth(200);
		txagencia .setMaxWidth(200);
		txnumconta .setMaxWidth(170);
		txtipoconta .setMaxWidth(100);
		txnometitular .setMaxWidth(200);
		txcnpj .setMaxWidth(100);
		
		Button bntsalva = new Button("Salvar");
		Button bntedita = new Button("Editar");
		Button bntbuscar = new Button("Buscar");
		Button bntexecluir =new Button ("Excluir");
		
		bntsalva.setPrefWidth(75);
		bntedita.setPrefWidth(75);
		bntbuscar.setPrefWidth(75);
		bntexecluir.setPrefWidth(75);
		
		EventHandler  event =new DadosBancarioController( txbanco, txagencia, txnumconta, txtipoconta, txnometitular, txcnpj);
		bntsalva.setOnAction(event);
		bntedita.setOnAction(event);
		bntbuscar.setOnAction(event);
		bntexecluir.setOnAction(event);
		
		
		
		
		HBox prilinha = new HBox(2);
		HBox seglinha = new HBox(2);
		HBox terlinha = new HBox(2);
		HBox qualinha = new HBox(2);
		HBox quilinha = new HBox(2);
		HBox sexlinha = new HBox(2);
		HBox setlinha = new HBox(4);
		
		
		prilinha.getChildren().addAll(lblbanco, txbanco);
		seglinha.getChildren().addAll(lblagencia, txagencia);
		terlinha.getChildren().addAll(lblnumconta,txnumconta);
		qualinha.getChildren().addAll(lbltipoconta,txtipoconta);
		quilinha.getChildren().addAll(lblnometitular,txnometitular);
		sexlinha.getChildren().addAll(lblcnpj,txcnpj);
		setlinha.getChildren().addAll(bntsalva,bntedita,bntbuscar, bntexecluir);
		
		
		VBox vbox = new VBox (8);
		Insets insert= new Insets(75,10,10,75);
		vbox.setPadding(insert);
		vbox.getChildren().addAll( prilinha,seglinha,terlinha,qualinha,quilinha,sexlinha,setlinha);
		tab.setContent(vbox);
		
		
	}
	
}
