package application;



import application.controllerTab.ControllerPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaPrincipal extends Application{
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
		
			Tab tab = new Tab("Marktplace Shoes", new Label("Marktplace Shoes"));
			
			tabpane.getTabs().add(tab);
			VBox vbox = new VBox(tabpane);
			Scene scene = new Scene(vbox,400,400);
			
			ControllerPrincipal control = new ControllerPrincipal ();
			
			control.addTabElementos(tab);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(TelaPrincipal.class,args);
	}
	
}
