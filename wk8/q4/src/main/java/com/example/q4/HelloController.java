package com.example.q4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle question5Circle;
    @FXML
    private  Label question5Label;
    @FXML
    private Label question5Labelmove;

    @FXML
    protected void onQuestion5MouseEntered() {
        question5Label.setText("inside");
    }
    @FXML
    protected void onQuestion5MouseExit() {
        question5Label.setText("outside");
    }


}