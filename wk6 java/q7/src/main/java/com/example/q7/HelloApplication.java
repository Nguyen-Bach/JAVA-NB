package com.example.q7;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    int state = 0;
    Circle c1, c2, c3;


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox paneForCircle = new VBox(15);
        paneForCircle.setAlignment(Pos.CENTER);

        c1 = getCircle();
        c2 = getCircle();
        c3 = getCircle();
        c1.setFill(Color.RED);

        paneForCircle.getChildren().addAll(c1,c2,c3);

        Rectangle rec = new Rectangle();
        rec.setFill(Color.BLACK);
        rec.setWidth(30);
        rec.setHeight(100);
        rec.setStroke(Color.BLACK);
        rec.setStrokeWidth(1);
        StackPane stopSign = new StackPane(rec, paneForCircle);

        HBox paneForButton = new HBox(5);
        paneForButton.setAlignment(Pos.CENTER);

        Button nextButton = new Button("next");
        Button exitButton = new Button("exit");

        paneForButton.getChildren().addAll(nextButton, exitButton);

        BorderPane pane = new BorderPane();
        pane.setCenter(stopSign);
        pane.setBottom(paneForButton);

        nextButton.setOnAction(new NextButtonHandler());
        exitButton.setOnAction(actionEvent -> {
            Platform.exit();
        });

        Scene scene = new Scene(pane, 200, 150);
        stage.setScene(scene);
        stage.setTitle("q7");
        stage.show();

    }
    class NextButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            if (state == 0) {
                c1.setFill(Color.BLACK);
                c2.setFill(Color.YELLOW);
                c3.setFill(Color.BLACK);
                state = state + 1;
            } else if (state == 1) {
                c1.setFill(Color.BLACK);
                c2.setFill(Color.BLACK);
                c3.setFill(Color.GREEN);
                state = state + 1;
            } else if (state == 2) {
                c1.setFill(Color.RED);
                c2.setFill(Color.BLACK);
                c3.setFill(Color.BLACK);
                state = 0;
            }
        }
    }

    private Circle getCircle() {
        Circle c = new Circle();
        c.setRadius(10);
        c.setFill(Color.BLACK);
        c.setStroke(Color.BLACK);
        return c;
    }
}