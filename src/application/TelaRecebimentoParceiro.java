package application;

import application.controllerTab.ControllerRecebimentoParceiro;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaRecebimentoParceiro extends Application {
	
	
	public void start(Stage primaryStage) {
	try {
		TabPane  tabpane = new TabPane();
		Tab tab = new Tab("Recebimentos Parceiros", new Label("Recebimentos Parceiros"));
		
	        
	tabpane.getTabs().add(tab);
	 VBox vbox = new VBox(tabpane);
	 Scene scene= new Scene(vbox, 500,400);
	 
	 ControllerRecebimentoParceiro cp = new ControllerRecebimentoParceiro();
	 cp.addElemento(tab);
	 
	 primaryStage.setScene(scene);
		primaryStage.setTitle("Marktplace Shoes");
		primaryStage.show();
	 	}catch( Exception e) {
	 		e.printStackTrace();
	 	}
		}
	
	 public static void main(String[] args) {
			Application.launch(TelaRecebimentoParceiro.class,args);
		}
}

