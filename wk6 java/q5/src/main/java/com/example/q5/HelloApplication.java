package com.example.q5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        Circle c1 = new Circle(20 + Math.random() * 200, 20 + Math.random() * 201, 15);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);


        Circle c2 = new Circle(20 + Math.random() * 200, 20 + Math.random() * 201, 15);
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLUE);

        Line line = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());

        pane.setLayoutX(200);
        pane.setLayoutY(200);


        pane.getChildren().addAll(line, c1, c2, new Text(c1.getCenterX(), c1.getCenterY(), "1"),
                new Text(c2.getCenterX(), c2.getCenterY(), "2"));
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }
}




















