package application.controllerTab;


import applicationcontroller.model.CarrinhoController;

import javafx.event.EventHandler;
import javafx.geometry.Insets;

import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class CarrinhoTabController {
	


    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void addTabElements(Tab tab) {
       
    	
       
        Label lblNome= new Label("Produto");
        Label lblQuant = new Label("Quantidade");
        Label lblPreco = new Label("Preço");
        Label lblQuant1 = new Label("1");
        Label lblValor = new Label();
        Label lblCodigo = new Label("");
    
        
        lblNome.setStyle("-fx-text-fill: darkblue; -fx-font-family: 'Arial'; -fx-font-size: 16px;");
       
        
        lblCodigo.setPrefWidth(75);
        lblNome.setPrefWidth(150);
        lblQuant1.setPrefWidth(50);
        lblQuant.setPrefWidth(150);
        lblPreco.setPrefWidth(100);
        lblValor.setPrefWidth(300);
        
        Button btnbuscar = new Button("Buscar");
        Button btnComp = new Button("Comprar");
        btnComp.setPrefWidth(100);
        btnbuscar.setPrefWidth(100);
        EventHandler event = new CarrinhoController( lblNome,lblQuant, lblPreco);
        btnComp.setOnAction(event);		
        btnbuscar.setOnAction(event);		
        
       
        GridPane gridPane = new GridPane();
        gridPane.setHgap(20); 
        gridPane.setVgap(20);
        
      
        gridPane.addRow(2, lblNome,lblCodigo, lblQuant1, lblValor);
     
        
       
        gridPane.add(lblQuant, 2, 1);
        gridPane.add(lblPreco, 3, 1);
        gridPane.add(btnComp, 3, 10);
        gridPane.add(btnbuscar,2, 10);
      
        VBox vBox = new VBox(10);
        Insets insets = new Insets(10);
        vBox.setPadding(insets);
        vBox.getChildren().addAll(gridPane);
        tab.setContent(vBox);
    }
}