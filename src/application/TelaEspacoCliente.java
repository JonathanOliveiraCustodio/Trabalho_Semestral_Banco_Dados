package application;

import application.controllerTab.ControllerEspacoCliente;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaEspacoCliente extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
		
			Tab tab = new Tab("Espaço do Cliente", new Label("Espaço do Cliente"));
			
			tabpane.getTabs().add(tab);
			VBox vbox = new VBox(tabpane);
			Scene scene = new Scene(vbox,700,600);
			
			ControllerEspacoCliente cliespccontrol = new ControllerEspacoCliente ();
			
			cliespccontrol.addTabElementos(tab);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(TelaEspacoCliente.class,args);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
