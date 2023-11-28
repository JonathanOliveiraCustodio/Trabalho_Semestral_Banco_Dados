package application;


import application.controllerTab.ControllerEspacoParceiro;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaEspacoParceiro extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab3 = new Tab("Espaço do Parceiro", new Label ("Espaço do Parceiro"));
			
			tabpane.getTabs().add(tab3);
			VBox vBox = new VBox (tabpane);
		
			
			Scene scene = new Scene(vBox,700,500);
			ControllerEspacoParceiro  espparc= new ControllerEspacoParceiro();
			espparc.addElemento(tab3);
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	

			

		
	public static void main(String[] args) {
		Application.launch(TelaEspacoParceiro.class,args);
	}
	
		
	}
	


