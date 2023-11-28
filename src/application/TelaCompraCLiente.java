package application;

import application.controllerTab.ControllerCompra;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCompraCLiente {
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab = new Tab("Espaço do Cliente", new Label ("Espaço do Cliente"));
			
			tabpane.getTabs().add(tab);
			VBox vBox = new VBox (tabpane);
		
			
			Scene scene = new Scene(vBox,800,500);
			ControllerCompra espparc= new ControllerCompra();
			espparc.addElemento(tab);
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			Application.launch(args);
		}
}
