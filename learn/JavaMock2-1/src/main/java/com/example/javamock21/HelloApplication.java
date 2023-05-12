package com.example.javamock21;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.Key;

import static javafx.scene.input.KeyCode.*;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    private int color = 1;

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane);

        Label label = new Label();
        label.setText("Java is cool!");
        label.setLayoutX(50);
        label.setLayoutY(50);
        label.setFont(Font.font("Arial",40));
        label.setTextFill(Color.BLUE);
        int currentFontSize = 40;





        EventHandler<MouseEvent> eventHandler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (color == 1) {
                    label.setTextFill(Color.RED);
                    color = 0;
                } else if (color == 0) {
                    label.setTextFill(Color.BLUE);
                    color = 1;
                }
            }
        };
        pane.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);

       scene.setOnKeyPressed(e -> {
           if (e.getCode() == UP) {
               double currSize = label.getFont().getSize();

               if (currSize <= 80) {
                   label.setFont(Font.font(currSize + 5));
               }
           } else if (e.getCode() == DOWN) {
               double currSize = label.getFont().getSize();

               if (currSize >= 10) {
                   label.setFont(Font.font(currSize - 5));
               }
           }
       });



        pane.getChildren().add(label);




        stage.setScene(scene);
        stage.setTitle("mock1");
        stage.show();
    }


}