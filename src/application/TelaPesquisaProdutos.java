package application;

import application.controllerTab.ControllerPesquisaProdutos;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class TelaPesquisaProdutos extends Application {
	@SuppressWarnings("unused")
	@Override
	public void start(Stage primaryStage) {
		try {
			
			TabPane tabPane = new TabPane();
			
            Tab tabProd = new Tab("Pesquisar Calçados", new Label(""));
			
			tabPane.getTabs().add(tabProd);
			VBox vBox = new VBox (tabPane);
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(vBox,900,600);
			
			ControllerPesquisaProdutos p = new ControllerPesquisaProdutos ();
			
			
			p.addTabElements(tabProd);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Pesquisa de Calçados");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			
			
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	}
