package application;
	


import application.controllerTab.ControllerCadastroParceiro;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import javafx.scene.layout.VBox;


public class TelaCadastroParceiro extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			
			
			Tab tab1 = new Tab("Cadastro de Parceiro", new Label("Cadastro de Parceiro"));
			
			tabpane.getTabs().add(tab1);
									
			VBox vBox = new VBox (tabpane);
					
			Scene scene = new Scene(vBox,700,600);
			
			ControllerCadastroParceiro cadparceiro= new ControllerCadastroParceiro();
			cadparceiro.addElemento(tab1);
								
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(TelaCadastroParceiro.class,args);
	}
}
