package application;



import application.controllerTab.ControllerVisualizacaoProduto;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaVisualizacaoProduto extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab = new Tab("Cadastro de Produto", new Label("Cadastro de Produto"));

			tabpane.getTabs().add(tab);
			VBox vbox = new VBox(tabpane);
			Scene scene = new Scene(vbox, 900, 600);

			ControllerVisualizacaoProduto cp = new ControllerVisualizacaoProduto();
			
			cp.addElemento(tab);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Marktplace Shoes");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(TelaVisualizacaoProduto.class, args);
	}
}
