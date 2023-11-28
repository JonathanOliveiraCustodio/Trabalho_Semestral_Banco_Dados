package application.controllerTab;

import applicationcontroller.model.CadastroClienteController;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ControllerCadastroCliente {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addTabElementos(Tab tab) {
		
		Label lblcod =new Label("Codigo Cliente");
		Label lblnome = new Label("Nome completo:");
		Label lblcpf = new Label("CPF:");
		Label lbldatanasc = new Label("Data de Nascimento:");
		Label lblsenha = new Label("Senha:");
		Label lblconfsenha = new Label("Confirme a senha:");
		Label lblemail= new Label("Email Principal:");
		Label lbltele = new Label("Telefone:");
		Label lblcep = new Label("CEP:");
		Label lbllog = new Label("Logradouro:");
		Label lblnum = new Label("Número:");
		Label lblcomp = new Label("Complemento:");
		Label lblbairro = new Label("Bairro:");
		Label lblcidade = new Label("Cidade:");
		Label lblestado = new Label("Estado:");
		Label lblpontoref = new Label("Ponto de referencia:");
		
		
		lblnome.setPrefWidth(110);
		lblcpf.setPrefWidth(110);
		lbldatanasc.setPrefWidth(110);
		lblsenha.setPrefWidth(110);
		lblconfsenha.setPrefWidth(110);
		lblemail.setPrefWidth(110);
		lbltele.setPrefWidth(110);
		lblcep.setPrefWidth(110);
		lbllog.setPrefWidth(110);
		lblnum.setPrefWidth(110);
		lblcomp.setPrefWidth(110);
		lblbairro.setPrefWidth(110);
		lblcidade.setPrefWidth(110);
		lblestado.setPrefWidth(110);
		lblpontoref.setPrefWidth(110);
		lblcod.setPrefWidth(110);

		TextField txtnome = new TextField();
		TextField txtcpf = new TextField();
		TextField txtdatanasc = new TextField();
		TextField txtsenha = new TextField();
		TextField txtconfsenha = new TextField();
		TextField txtemail = new TextField();
		TextField txttele = new TextField();
		TextField txtcep = new TextField();
		TextField txtlog = new TextField();
		TextField txtnum = new TextField();
		TextField txtcomp = new TextField();
		TextField txtbairro = new TextField();
		TextField txtcidade = new TextField();
		TextField txtestado = new TextField();
		TextField txtpontoref = new TextField();
		TextField txtcod = new TextField();
		
		txtnome.setMaxWidth(200);
		txtcpf.setPrefWidth(75);
	    txtdatanasc.setPrefWidth(75); 
		txtsenha.setPrefWidth(75);
	    txtconfsenha.setPrefWidth(75);
		txtemail.setMaxWidth(200);
	    txttele.setPrefWidth(75);
	    txtcep .setPrefWidth(75);
	    txtlog.setMaxWidth(150);
	    txtnum.setPrefWidth(75);
	    txtcomp.setPrefWidth(75);
	    txtbairro.setMaxWidth(200);
	    txtcidade.setMaxWidth(200);
	    txtestado.setPrefWidth(75);
	    txtpontoref.setMaxWidth(200);
	    txtcod.setPrefWidth(75);
	    
	    Button btnCons = new Button("Buscar");
	    Button btnCadastrar = new  Button("Cadastrar");
	    Button btnEditar = new  Button("Editar");
	    btnCadastrar.setPrefWidth(90);
	    btnEditar.setPrefWidth(90);
	    btnCons.setPrefWidth(90);
	    
	    EventHandler event = new CadastroClienteController( txtnome, txtcpf, txtdatanasc, txtsenha,txtemail, txttele, txtcep, txtlog, txtnum,txtcomp,
				 txtbairro,  txtcidade, txtestado, txtpontoref, txtcod);
		btnCadastrar.setOnAction(event);
		btnEditar.setOnAction(event);
		btnCons.setOnAction(event);
	    

        GridPane gridPane = new GridPane();
        gridPane.setHgap(15); 
        gridPane.setVgap(15); 
        
        gridPane.addRow(0, lblcod,txtcod);
        gridPane.addRow(1, lblnome, txtnome, lblcep, txtcep);
        gridPane.addRow(2, lblcpf, txtcpf, lbllog, txtlog);
        gridPane.addRow(3, lbldatanasc, txtdatanasc, lblnum, txtnum);
        gridPane.addRow(4, lblsenha, txtsenha, lblcomp, txtcomp);
        gridPane.addRow(5, lblconfsenha, txtconfsenha, lblbairro, txtbairro);
        gridPane.addRow(6, lblemail, txtemail, lblcidade,txtcidade);
        gridPane.addRow(7, lbltele, txttele, lblestado, txtestado);

     
	   
        gridPane.add(lblpontoref, 2, 8);
        gridPane.add(txtpontoref, 3, 8); 
        gridPane.add(btnCons, 2, 12);
        gridPane.add(btnEditar, 3, 12);
        gridPane.add(btnCadastrar, 1, 12); 
        
	    VBox vbox = new VBox(10);
	    Insets insets = new Insets(10);
	    vbox.setPadding(insets);
	    vbox.getChildren().addAll(gridPane);
	    tab.setContent(vbox);
	    
	}
}
