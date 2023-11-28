package application;
	

import javafx.stage.Stage;
import application.controllerTab.ControllerDadosBancarios;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import javafx.scene.layout.VBox;


public class TelaDadosBancario extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab1 = new Tab("Dados Bancario do Parceiro", new Label ("Dados Bancario do Parceiro"));
			tabpane.getTabs().add(tab1);
			VBox vBox = new VBox (tabpane);
					
			Scene scene = new Scene(vBox,500,400);
			ControllerDadosBancarios bb= new ControllerDadosBancarios();
			bb.addElemento(tab1);
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Application.launch(TelaDadosBancario.class,args);
	}
}
