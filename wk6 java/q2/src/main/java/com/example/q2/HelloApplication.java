package com.example.q2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
   

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage Primarystage) throws Exception {

        GridPane pane = new GridPane();


        for (int i = 0; i < 8; i += 2) {
            for (int j = 1; j < 8; j += 2) {
                Rectangle recW = new Rectangle(60,60);
                pane.add(recW, i, j);
                recW.setFill(Color.BLACK);
            }
        }
        for (int i = 1; i < 8; i += 2) {
            for (int j = 0; j < 8; j += 2) {
                Rectangle recB = new Rectangle(60,60);
                pane.add(recB, i, j);
                recB.setFill(Color.BLACK);
            }
        }


        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}