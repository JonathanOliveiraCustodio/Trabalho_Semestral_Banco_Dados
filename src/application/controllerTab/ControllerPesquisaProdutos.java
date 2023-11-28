package application.controllerTab;

import applicationcontroller.model.PesquisaProdutoController;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class ControllerPesquisaProdutos {
	
@SuppressWarnings({ "rawtypes", "unchecked" })
public void addTabElements(Tab tab) {
		
		Label lblTitulo1 = new Label ("Marktplace Shoes");
		lblTitulo1.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
		Label lblMarca1 = new Label ("Marca:");
		Label lblTamanho1 = new Label ("Tamanho:");
		Label lblPreco1 = new Label ("Preço: R$");
		
		Label lblMarca2 = new Label ("Marca:");
		Label lblTamanho2 = new Label ("Tamanho:");
		Label lblPreco2 = new Label ("Preço: R$");
		
		Label lblMarca3 = new Label ("Marca:");
		Label lblTamanho3 = new Label ("Tamanho:");
		Label lblPreco3 = new Label ("Preço: R$");
		
		Label lblMarca4 = new Label ("Marca:");
		Label lblTamanho4 = new Label ("Tamanho:");
		Label lblPreco4 = new Label ("Preço: R$");
		
		Label espaço = new Label ("  ");
		Label espaço2= new Label ("  ");
		Label espaço3 = new Label ("  ");
		Label espaço4 = new Label ("  ");
		Label espaço5= new Label ("  ");
		Label espaço6 = new Label ("  ");
		Label espaço7 = new Label ("  ");
		Label espaço8= new Label ("  ");
		Label espaço9 = new Label ("  ");
		Label espaço10 = new Label ("  ");
		Label espaço11= new Label ("  ");
		Label espaço12 = new Label ("  ");
		
		
		lblTitulo1.setPrefWidth(200);
		lblMarca1.setPrefWidth(50);
		lblTamanho1.setPrefWidth(150);
		lblPreco1.setPrefWidth(150);
		
		lblMarca2.setPrefWidth(150);
		lblTamanho2.setPrefWidth(150);
		lblPreco2.setPrefWidth(150);
		
		lblMarca3.setPrefWidth(150);
		lblTamanho3.setPrefWidth(150);
		lblPreco3.setPrefWidth(150);
		
		lblMarca4.setPrefWidth(150);
		lblTamanho4.setPrefWidth(150);
		lblPreco4.setPrefWidth(150);
		
		
		TextField Pesquisa = new TextField();
		Pesquisa.setPrefWidth(200);
		Pesquisa.setMaxWidth(300);
		
		Label lblDNomeP1 = new Label();
		lblDNomeP1.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
		lblDNomeP1.setPrefWidth(200);
		lblDNomeP1.setMaxWidth(300);
		
		Label lblDTamanho1= new Label();
		lblDTamanho1.setPrefWidth(200);
		lblDTamanho1.setMaxWidth(300);
		
		Label lblDMarca1 = new Label();
		lblDMarca1.setPrefWidth(200);
		lblDMarca1.setMaxWidth(300);
		
		Label lblDPreco1 = new Label();
		lblDPreco1.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;-fx-text-fill: blue;");
		lblDPreco1.setPrefWidth(200);
		lblDPreco1.setMaxWidth(300);
		
		
		Label lblDNomeP2 = new Label("Nome Produto 2");
		lblDNomeP2.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
		lblDNomeP2.setPrefWidth(200);
		lblDNomeP2.setMaxWidth(300);
		
		Label lblDTamanho2= new Label("Tamanho Produto 2");
		lblDTamanho2.setPrefWidth(200);
		lblDTamanho2.setMaxWidth(300);
		
		Label lblDMarca2 = new Label("Marca Produto 2");
		lblDMarca2.setPrefWidth(200);
		lblDMarca2.setMaxWidth(300);
		
		Label lblDPreco2 = new Label("Preço Produto 2");
		lblDPreco2.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;-fx-text-fill: blue;");
		lblDPreco2.setPrefWidth(200);
		lblDPreco2.setMaxWidth(300);
		
		
		Label lblDNomeP3 = new Label("Nome Produto 3");
		lblDNomeP3.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
		lblDNomeP3.setPrefWidth(200);
		lblDNomeP3.setMaxWidth(300);
		
		
		Label lblDTamanho3= new Label("Tamanho Produto 3");
		lblDTamanho3.setPrefWidth(200);
		lblDTamanho3.setMaxWidth(300);
		
		Label lblDMarca3 = new Label("Marca Produto 3");
		lblDMarca3.setPrefWidth(200);
		lblDMarca3.setMaxWidth(300);
		
		Label lblDPreco3 = new Label("Preço Produto 3");
		lblDPreco3.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;-fx-text-fill: blue;");
		lblDPreco3.setPrefWidth(200);
		lblDPreco3.setMaxWidth(300);
		
		
		Label lblDNomeP4 = new Label("Nome Produto 4");
		lblDNomeP4.setPrefWidth(200);
		lblDNomeP4.setMaxWidth(300);
		
		Label lblDTamanho4= new Label("Tamanho Produto 4");
		lblDTamanho4.setPrefWidth(200);
		lblDTamanho4.setMaxWidth(300);
		
		Label lblDMarca4 = new Label("Marca Produto 4");
		lblDMarca4.setPrefWidth(200);
		lblDMarca4.setMaxWidth(300);
		
		Label lblDPreco4 = new Label("Preço Produto 4");
		lblDPreco4.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;-fx-text-fill: blue;");
		lblDPreco4.setPrefWidth(200);
		lblDPreco4.setMaxWidth(300);
		
		
		
		Button Pesquisar = new Button("Pesquisar");
		Pesquisar.setPrefWidth(100);
		
		
		
		Button btnAdicionar1 = new Button("Adicionar 1");
		btnAdicionar1.setPrefWidth(80);
		
		Button btnVisualizar1 = new Button("Visualizar 1");
		btnVisualizar1.setPrefWidth(80);
		
		Button btnAdicionar2 = new Button("Adicionar 2");
		btnAdicionar2.setPrefWidth(80);
		
		Button btnVisualizar2 = new Button("Visualizar 2");
		btnVisualizar2.setPrefWidth(80);
		
		Button btnAdicionar3 = new Button("Adicionar 3");
		btnAdicionar3.setPrefWidth(80);
		
		Button btnVisualizar3 = new Button("Visualizar 3");
		btnVisualizar3.setPrefWidth(80);
				
		Button btnAdicionar4 = new Button("Adicionar 4");
		btnAdicionar4.setPrefWidth(80);
		
		Button btnVisualizar4 = new Button("Visualizar 4");
		btnVisualizar4.setPrefWidth(80);
		
		EventHandler event =new PesquisaProdutoController(lblDNomeP1, lblDTamanho1, lblDMarca1, lblDPreco1, lblDNomeP2, lblDTamanho2, lblDMarca2, lblDPreco2, lblDNomeP3, lblDTamanho3, lblDMarca3, lblDPreco3, lblDNomeP4, lblDTamanho4, lblDMarca4, lblDPreco4);
		Pesquisar.setOnAction(event);
		btnVisualizar1.setOnAction(event);
		btnVisualizar2.setOnAction(event);
		btnVisualizar3.setOnAction(event);
		btnVisualizar4.setOnAction(event);
		btnAdicionar1.setOnAction(event);
		btnAdicionar2.setOnAction(event);
		btnAdicionar3.setOnAction(event);
		btnAdicionar4.setOnAction(event);
		
		 GridPane gridPane2 = new GridPane();
	        gridPane2.setHgap(15); 
	        gridPane2.setVgap(15);

	        gridPane2.addRow(0, lblTitulo1, Pesquisa, Pesquisar);
	        gridPane2.addRow(3, lblDNomeP1, espaço, espaço6,  lblDNomeP2);
	        gridPane2.addRow(4, lblMarca1, lblDMarca1, espaço2 , lblMarca2, lblDMarca2);
	        gridPane2.addRow(5, lblTamanho1,lblDTamanho1, espaço3,lblTamanho2, lblDTamanho2);
	        gridPane2.addRow(6, lblPreco1, lblDPreco1, espaço4, lblPreco2, lblDPreco2);
	        gridPane2.addRow(7, btnAdicionar1, btnVisualizar1, espaço5 ,btnAdicionar2, btnVisualizar2);
	        
	 
	        gridPane2.addRow(11, lblDNomeP3, espaço7 ,espaço8, lblDNomeP4);
	        gridPane2.addRow(12, lblMarca3, lblDMarca3,espaço9, lblMarca4, lblDMarca4);
	        gridPane2.addRow(13, lblTamanho3, lblDTamanho3,espaço10, lblTamanho4, lblDTamanho4);
	        gridPane2.addRow(14, lblPreco3, lblDPreco3, espaço11, lblPreco4, lblDPreco4);
	        gridPane2.addRow(15, btnAdicionar3, btnVisualizar3, espaço12, btnAdicionar4, btnVisualizar4);
	    
	        
			VBox vBox = new VBox(30);
			
		    Insets insets = new Insets(30);
		    vBox.setPadding(insets);
		    vBox.getChildren().addAll(gridPane2);
		    tab.setContent(vBox);
		    
		    
		    
		    
			
		}
		
		
}
		