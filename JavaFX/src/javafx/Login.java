package javafx;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application{
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage palco){
        AnchorPane painel = new AnchorPane();
        painel.setPrefSize(400, 300);
        
        TextField textoUser = new TextField();
        textoUser.setPromptText("Login:");
        TextField textoSenha = new TextField();
        textoSenha.setPromptText("Senha:");
        Text titulo =  new Text();
        Font fonte = new Font("Times News Roman", 25);
        titulo.setFont(fonte);
        titulo.setText("Cadastro");
        String aux = titulo.getText();
        
        Button entrar = new Button("Entrar");
        
        painel.getChildren().addAll(titulo, textoUser, textoSenha, entrar);
        
        Scene cena = new Scene(painel);
        
        palco.setScene(cena);
        palco.show();     
        
        titulo.setLayoutX((painel.getWidth() - (aux.length())*(14))/2);
        titulo.setLayoutY(50);
        textoUser.setLayoutX((painel.getWidth() - textoUser.getWidth())/2);
        textoUser.setLayoutY((painel.getHeight() - textoUser.getHeight())/2 - 50);
        textoSenha.setLayoutX((painel.getWidth() - textoSenha.getWidth())/2);
        textoSenha.setLayoutY(((painel.getHeight()- textoSenha.getHeight())/2) - 20);
        entrar.setLayoutX((painel.getWidth() - entrar.getWidth())/2);
        entrar.setLayoutY(((painel.getHeight()- entrar.getHeight())/2) + 10);
    }
}
