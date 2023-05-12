package com.example.javafxlearn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle circle;
    @FXML
    private Label movingLabel;
    @FXML
    private Label label;

    @FXML
    protected void mouseEntered() {
        label.setText("Inside");
    }
    @FXML
    protected void mouseExit() {
        label.setText("outside");
    }


    @FXML
    protected void onCircleMouseMove(MouseEvent e) {
        movingLabel.setLayoutX(e.getX() + 15);
        movingLabel.setLayoutY(e.getY() + 15);

        double a = e.getX() - circle.getCenterX();
        double b = e.getY() - circle.getCenterY();



        if (a <= circle.getRadius())
            movingLabel.setText("Inside");
        else
            movingLabel.setText("Outside");
    }



//    @FXML
//    private Circle myCircle;
//    private double x;
//    private double y;
//    @FXML
//    private Pane pane;
//    @FXML
//    private Label myLabel;
//
//    @FXML
//    protected void buttonUp() {
//        myLabel.setText("inside");
//
//        double circleUp = myCircle.getLayoutY() - myCircle.getRadius();
//        double paneUp = pane.getLayoutY();
//
//        if (circleUp >= paneUp) {
//            myCircle.setLayoutY(myCircle.getLayoutY() - 5);
//        } else {
//            myLabel.setText("out of bound");
//        }
//
//    }
//    @FXML
//    protected void buttonDown() {
//        myLabel.setText("inside");
//
//        double circleDown = myCircle.getLayoutY() + myCircle.getRadius();
//        double paneDown = pane.getLayoutY() + pane.getHeight();
//
//        if (circleDown <= paneDown) {
//            myCircle.setLayoutY(myCircle.getLayoutY() + 5);
//        } else {
//            myLabel.setText("out of bound");
//        }
//    }
//    @FXML
//    protected void buttonRight() {
//        myLabel.setText("inside");
//
//        double circleRight = myCircle.getLayoutX() + myCircle.getRadius();
//        double paneRight = pane.getLayoutX() + pane.getWidth();
//
//        if (circleRight <= paneRight) {
//            myCircle.setLayoutX(myCircle.getLayoutX() + 5);
//        } else {
//            myLabel.setText("out of bound");
//        }
//    }
//    @FXML
//    protected void buttonLeft() {
//        myLabel.setText("inside");
//
//        double circleLeft = myCircle.getLayoutX() - myCircle.getRadius();
//        double paneLeft = pane.getLayoutX();
//
//        if (circleLeft >= paneLeft) {
//            myCircle.setLayoutX(myCircle.getLayoutX() - 5);
//        } else {
//            myLabel.setText("out of bound");
//        }
//    }





}