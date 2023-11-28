package application;




import application.controllerTab.ControllerClienteProduto;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaClienteProduto extends Application {
	
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab = new Tab("Espaço do Parceiro", new Label ("Espaço do Parceiro"));
			
			tabpane.getTabs().add(tab);
			VBox vBox = new VBox (tabpane);
		
			
			Scene scene = new Scene(vBox,800,500);
			ControllerClienteProduto  espparc= new ControllerClienteProduto();
			espparc.addElemento(tab);
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Application.launch(TelaClienteProduto.class,args);
	}
		
}
