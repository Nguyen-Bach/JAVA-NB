package com.example.q5wk6java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle circle;
    @FXML
    private Label moveLabel;
    @FXML
    private Label label;

    @FXML
    protected void onMouseEntered() {
        this.label.setText("inside");
    }
    @FXML
    protected void onMouseExited() {
        this.label.setText("outside");
    }
    @FXML
    protected void omMouseMove(MouseEvent e) {
        moveLabel.setLayoutX(e.getX() + 15);
        moveLabel.setLayoutY(e.getY() + 15);
    }
}