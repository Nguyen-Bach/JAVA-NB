package com.example.q2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class q3 extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage Primarystage) throws Exception {
        GridPane pane = new GridPane();

        Rectangle rec1 = new Rectangle(60,60);
        rec1.setFill(Color.RED);
        pane.add(rec1, 1,1);






        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}

