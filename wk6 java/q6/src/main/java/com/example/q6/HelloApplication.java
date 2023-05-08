package com.example.q6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
        Line line = new Line(startX, startY, endX, endY);
        pane.getChildren().add(line);

    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();



        drawArrowLine(Math.random() * 400, Math.random() * 400,
                 Math.random() * 400, Math.random() * 400, pane);

        Button button = new Button("refresh");

        button.setLayoutX(270);
        button.setLayoutY(550);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                pane.getChildren().clear();
                drawArrowLine( Math.random() * 400, Math.random() * 400,
                         Math.random() * 400, Math.random() * 400, pane);
                pane.getChildren().add(button);
            }
        });

        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 600,600);

        stage.setTitle("q6");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}