package application;

import application.controllerTab.ControllerLoginCliente;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaLoginCliente extends Application{
	@Override
	 public void start (Stage primaryStage) {
	try {
		TabPane  tabpane = new TabPane();
		Tab tab = new Tab("Identificação do Cliente", new Label("Logoin Cliente"));
		
	        
	tabpane.getTabs().add(tab);
	 VBox vbox = new VBox(tabpane);
	 Scene scene= new Scene(vbox, 1000,200);
	 
	 ControllerLoginCliente bb= new ControllerLoginCliente();
	bb.addElemento(tab);
	
	 
		primaryStage.setScene(scene);
		primaryStage.setTitle("Marktplace Shoes");
		primaryStage.show();
	 	}catch( Exception e) {
	 		e.printStackTrace();
	 	}
		}
		
		      
	public static void main (String [ ]args) {
		Application.launch(TelaLoginCliente.class,args);
	}
}
