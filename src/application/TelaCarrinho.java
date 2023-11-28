package application;


import application.controllerTab.CarrinhoTabController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCarrinho extends Application {
	@Override
	public void start(Stage stage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab = new Tab("Carrinho", new Label("Carrinho"));
			tabpane.getTabs().add(tab);
			VBox vbox = new VBox(tabpane);
			Scene scene = new Scene(vbox,700,450);
			CarrinhoTabController cacontrol = new CarrinhoTabController ();
			cacontrol.addTabElements(tab);
		
			stage.setScene(scene);
			stage.setTitle("Carrinho");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}