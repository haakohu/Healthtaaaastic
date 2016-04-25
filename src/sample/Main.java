package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    static Stage primaryStage;
    static boolean hasCompetition = false;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("dashboard-noActive.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 800));
        primaryStage.show();
    }


    @FXML
    protected static void changeToScene(String scene){
        try{
            Parent root = FXMLLoader.load(Main.class.getResource(scene));
            Main.primaryStage.setScene(new Scene(root));
        }catch (IOException e){
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}
