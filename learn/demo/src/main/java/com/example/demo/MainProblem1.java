package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainProblem1 extends Application {

    private Text text;
    private Pane pane;
    private Scene scene;

    private void createText() {
        // Create the text object
        text = new Text("Java is cool!");
        text.setX(50); // set the x location to 50
        text.setY(50); // set the y location to 50
        // set the font to be Arial, bold, and size is 40
        text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 40));
        // Init the color to be blue
        text.setFill(Color.BLUE);
    }

    private void createPane() {
        // Create pane to store the text
        pane = new Pane();
        // Add text to pane
        pane.getChildren().add(text);
    }

    private void setPaneClick() {
        // Set on mouse click to change the color
        pane.setOnMouseClicked(e -> {
            // if the color is red, then change to blue and vice versa
            if (text.getFill().equals(Color.RED)) {
                text.setFill(Color.BLUE);
            } else {
                text.setFill(Color.RED);
            }
        });
    }

    private void setSceneKeyInput() {
        // make the scene to listen for key press
        scene.setOnKeyPressed(e -> {
            // create a size to store the current size
            double size = text.getFont().getSize();
            // if the key press is up arrow and the size + 5 is less than 80 then change
            if ((e.getCode() == KeyCode.UP) && (size + 5 < 80)) {
                size = size + 5;
            }
            // if the key press is down arrow and the size - 5 is greater than 10 then change
            if ((e.getCode() == KeyCode.DOWN) && (size - 5 > 10)) {
                size = size - 5;
            }
            text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, size));

            // this is to ensure the key press is consumed for further pressed
            e.consume();
        });
    }
    @Override
    public void start(Stage stage) {
        createText();
        createPane();
        setPaneClick();

        // create a scene to store pane and set the size to 600 and 400
        scene = new Scene(pane, 600, 400);

        setSceneKeyInput();

        // set stage title
        stage.setTitle("Problem 1");
        // add scene to stage
        stage.setScene(scene);
        // present the program
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
