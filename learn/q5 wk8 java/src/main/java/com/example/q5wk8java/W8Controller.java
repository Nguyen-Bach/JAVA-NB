package com.example.q5wk8java;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.util.Duration;

public class W8Controller {
    /***************
     * QUESTION 03 *
     ***************/

    @FXML
    private Label question3Label;
    private boolean isClicked = true;

    @FXML
    protected void onQuestion3ButtonClick() {
        question3Label.setText(isClicked ? "Java is powerful!" : "Java is fun!");
        isClicked = !isClicked;
    }

    /***************
     * QUESTION 04 *
     ***************/

    @FXML
    private Pane question4Pane;

    @FXML
    private Label question4Label;

    @FXML
    private Circle question4Circle;

    @FXML
    protected void onQuestion4ButtonLeft() {
        question4Label.setText("Inside");

        double circleLeft = question4Circle.getLayoutX() - question4Circle.getRadius();
        double paneLeft = question4Pane.getLayoutX();

        if (circleLeft >= paneLeft)
            question4Circle.setLayoutX(question4Circle.getLayoutX() - 1);
        else
            question4Label.setText("Out of bound.");
    }

    @FXML
    protected void onQuestion4ButtonRight() {
        question4Label.setText("Inside");

        double circleRight = question4Circle.getLayoutX() + question4Circle.getRadius();
        double paneRight = question4Pane.getLayoutX() + question4Pane.getWidth();

        if (circleRight <= paneRight)
            question4Circle.setLayoutX(question4Circle.getLayoutX() + 1);
        else
            question4Label.setText("Out of bound.");
    }

    @FXML
    protected void onQuestion4ButtonUp() {
        question4Label.setText("Inside");

        double circleUp = question4Circle.getLayoutY() - question4Circle.getRadius();
        double paneUp = question4Pane.getLayoutY();

        if (circleUp >= paneUp)
            question4Circle.setLayoutY(question4Circle.getLayoutY() - 1);
        else
            question4Label.setText("Out of bound.");
    }

    @FXML
    protected void onQuestion4ButtonDown() {
        question4Label.setText("Inside");

        double circleDown = question4Circle.getLayoutY() + question4Circle.getRadius();
        double paneDown = question4Pane.getLayoutY() + question4Pane.getHeight();

        if (circleDown <= paneDown)
            question4Circle.setLayoutY(question4Circle.getLayoutY() + 1);
        else
            question4Label.setText("Out of bound.");
    }

    /***************
     * QUESTION 05 *
     ***************/

    @FXML
    private Label question5Label;
    @FXML
    private Label question5MovingLabel;

    @FXML
    private Circle question5Circle;

    @FXML
    protected void onQuestion5PaneMouseEntered() {
        question5Label.setText("Inside");
    }

    @FXML
    protected void onQuestion5PaneMouseExited() {
        question5Label.setText("Outside");
    }

    @FXML
    protected void onQuestion5PaneMouseMoved(MouseEvent e) {
        question5MovingLabel.setLayoutX(e.getX() + 15);
        question5MovingLabel.setLayoutY(e.getY() + 15);

        // Calculate distance: c^2 = a^2 + b^2.
        double a = e.getX() - question5Circle.getCenterX();
        double b = e.getY() - question5Circle.getCenterY();

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = a2 + b2;

        double c = Math.sqrt(c2);
        double distance = c;

        if (distance <= question5Circle.getRadius())
            question5MovingLabel.setText("Inside");
        else
            question5MovingLabel.setText("Outside");
    }

    /***************
     * QUESTION 06 *
     ***************/

    @FXML
    private Label question6Label;

    @FXML
    private Line question6Line;

    @FXML
    private Circle question6Circle_1;
    @FXML
    private Circle question6Circle_2;

    private double question6MouseStartX, question6MouseStartY;

    protected void setMouseStartingPoint(MouseEvent e) {
        question6MouseStartX = e.getSceneX();
        question6MouseStartY = e.getSceneY();
    }

    protected void moveElements(Circle circle, MouseEvent e, boolean isLineStart) {
        double offsetX = e.getSceneX() - question6MouseStartX;
        double offsetY = e.getSceneY() - question6MouseStartY;

        circle.setCenterX(circle.getCenterX() + offsetX);
        circle.setCenterY(circle.getCenterY() + offsetY);

        if (isLineStart) {
            question6Line.setStartX(question6Line.getStartX() + offsetX);
            question6Line.setStartY(question6Line.getStartY() + offsetY);
        } else {
            question6Line.setEndX(question6Line.getEndX() + offsetX);
            question6Line.setEndY(question6Line.getEndY() + offsetY);
        }

        // Calculate distance: c^2 = a^2 + b^2.
        double a = question6Line.getStartX() - question6Line.getEndX();
        double b = question6Line.getStartY() - question6Line.getEndY();
        double distance = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        question6Label.setText(String.valueOf(Math.round(distance)));

        question6Label.layoutXProperty().bind(question6Circle_1.centerXProperty().add(question6Circle_2.centerXProperty()).divide(2));
        question6Label.layoutYProperty().bind(question6Circle_1.centerYProperty().add(question6Circle_2.centerYProperty()).divide(2));

        setMouseStartingPoint(e);
    }

    @FXML
    protected void onQuestion6Circle1MousePressed(MouseEvent e) {
        setMouseStartingPoint(e);
    }

    @FXML
    protected void onQuestion6Circle1MouseDragged(MouseEvent e) {
        moveElements(question6Circle_1, e, true);
    }

    @FXML
    protected void onQuestion6Circle2MousePressed(MouseEvent e) {
        setMouseStartingPoint(e);
    }

    @FXML
    protected void onQuestion6Circle2MouseDragged(MouseEvent e) {
        moveElements(question6Circle_2, e, false);
    }
}