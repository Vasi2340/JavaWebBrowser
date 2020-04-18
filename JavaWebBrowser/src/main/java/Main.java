package main.java;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        TabPane tabPane = new TabPane();
        Scene scene = new Scene(tabPane);

        primaryStage.setTitle("Jables");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
