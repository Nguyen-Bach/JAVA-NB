package com.example.q5wk8java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class W8Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(W8Application.class.getResource("w8-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("W8 Tutorial");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}