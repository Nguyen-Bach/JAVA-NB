package com.example.q5wk8java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle circle;

    @FXML
    private Label moveLabel;
    @FXML
    private Label label;


    protected void onMouseEntered() {
        label.setText("inside");
    }

    protected void onMouseExited() {
        label.setText("outside");
    }
}