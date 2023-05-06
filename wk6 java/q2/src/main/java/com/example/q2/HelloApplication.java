package com.example.q2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
   

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage Primarystage) throws Exception {

        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane);
        Stage stage = new Stage();

    }
}