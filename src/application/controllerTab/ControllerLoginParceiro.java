package application.controllerTab;





import applicationcontroller.model.LoginParceiroController;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class ControllerLoginParceiro {


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addElemento(Tab tab) {

       	Label lblTitulo1 = new Label("Já Sou Cadastrado");
		Label lblTitulo2 = new Label("Gostaria de me Cadastrar");

		lblTitulo1.setPrefWidth(200);
		lblTitulo1.setMaxWidth(200);
			
		lblTitulo1.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	    lblTitulo1.setTextFill(Color.BLUE);
		

		lblTitulo2.setPrefWidth(200);
		lblTitulo2.setMaxWidth(200);
		
		lblTitulo2.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	    lblTitulo2.setTextFill(Color.BLUE);
	        
	    Label lblLogin = new Label("Informe Seu CNPJ ou E-mail : ");
		Label lblSenha = new Label("Senha: ");
		Label lblCadastrar = new Label("Informe seu E-mail : ");
			
		TextField txtCadastrar = new TextField();
		TextField txtLogin = new TextField();
		PasswordField  txtSenha = new PasswordField ();
			
		
	    lblLogin.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	    lblLogin.setTextFill(Color.BLACK);
	    lblLogin.setPrefWidth(200);
	    
	        
	    
	    txtLogin.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	    txtLogin.setPrefWidth(200);
	    txtLogin.setMaxWidth(200);
	       

	    lblCadastrar.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	    lblCadastrar.setTextFill(Color.BLACK);
	        
	    
	    txtCadastrar.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	    txtCadastrar.setPrefWidth(250);
	      
	     
	    lblSenha.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	    lblSenha.setTextFill(Color.BLACK);
	    lblSenha.setPrefWidth(75);
	       
	 
	    txtSenha.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	   txtSenha.setPrefWidth(75);
	   
	   
	   Button btnLogar = new Button("Logar"); 
	   Button btnContinuar = new Button("Cadastrar");
	
	             
	   btnLogar.relocate(160, 270);
	   btnLogar.setPrefWidth(300); 
	   btnLogar.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	   btnLogar.setTextFill(Color.BLACK);
	   
	   btnContinuar.relocate(420, 270);
	   btnContinuar.setPrefWidth(300); 
	   btnContinuar.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 
	   btnContinuar.setTextFill(Color.BLACK);
	   
	   Hyperlink hlAlterarSenha = new Hyperlink("Esqueci Minha Senha");
	   hlAlterarSenha.relocate(125, 330); 
	   hlAlterarSenha.setFont(Font.font("Arial", FontWeight.NORMAL, 14)); 

	     
	   
	   
	   EventHandler event = new LoginParceiroController(txtLogin, txtSenha);
	   btnContinuar.setOnAction(event);
	   btnLogar.setOnAction(event);
	  
	   
	   GridPane gridPane = new GridPane();
       gridPane.setHgap(15); 
       gridPane.setVgap(15); 
       
       gridPane.add( lblTitulo1,0,0);
       gridPane.add(lblTitulo2, 3, 0);
       gridPane.add( lblLogin, 0,1);
       gridPane.add(txtLogin,1,1);
       gridPane.addRow(2, lblSenha,txtSenha);
       gridPane.add(btnLogar ,0,3 );
       gridPane.add(btnContinuar ,3,2 );
		
	        VBox vbox =new VBox(10);
	        Insets insert = new Insets(10);
	    
	        vbox.setPadding(insert);
	        vbox.getChildren().addAll(gridPane);
	        tab.setContent(vbox);
	    
	      
	       
	    }
		
		
}

