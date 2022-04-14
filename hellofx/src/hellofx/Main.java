package hellofx;

import java.io.IOException;


import org.jfugue.player.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("Main Scene.fxml"));
            Scene scene = new Scene(root);
            Player player = new Player();

            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            
            
        }
        catch(IOException e){

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}