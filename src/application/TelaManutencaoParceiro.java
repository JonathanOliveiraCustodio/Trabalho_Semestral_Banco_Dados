package application;


import application.controllerTab.ControllerManutencaoParceiro;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaManutencaoParceiro extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			
			
			Tab tab2 = new Tab("Manutenção de Parceiro", new Label ("Manutenção de Parceiro"));
						
			tabpane.getTabs().add(tab2);
						
			VBox vBox = new VBox (tabpane);
					
			Scene scene = new Scene(vBox,700,600);
			
			ControllerManutencaoParceiro manuparceiro = new ControllerManutencaoParceiro();
			manuparceiro.addElemento(tab2);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(TelaManutencaoParceiro.class,args);
	}
}
