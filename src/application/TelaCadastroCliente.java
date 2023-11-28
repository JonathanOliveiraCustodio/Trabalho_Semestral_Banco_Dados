package application;

import application.controllerTab.ControllerCadastroCliente;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCadastroCliente extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab = new Tab("Cadastrar Cliente", new Label("Cadastrar Cliente"));
		
			tabpane.getTabs().add(tab);
		
			VBox vbox = new VBox(tabpane);
			Scene scene = new Scene(vbox,700,600);
			ControllerCadastroCliente clicontrol = new ControllerCadastroCliente ();

			clicontrol.addTabElementos(tab);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Cliente");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(TelaCadastroCliente.class,args);
	}
}
