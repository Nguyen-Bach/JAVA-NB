package com.example.q5wk6java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class HelloController {

    @FXML
    private Circle circle1;
    @FXML
    private Circle circle2;

    @FXML
    private Line line;
    @FXML
    private Label label;
    private double mouseStartX;
    private double mouseStartY;
    @FXML
    protected void setMouseStarting(MouseEvent e) {
        this.mouseStartX = e.getSceneX();
        this.mouseStartY = e.getSceneY();
    }

    protected void mouseElement(MouseEvent e, Circle circle, boolean isLineStart) {
        double offsetX = e.getSceneX() - this.mouseStartX;
        double offsetY = e.getSceneY() - this.mouseStartY;

        circle.setCenterX(circle.getLayoutX() + offsetX);
        circle.setCenterY(circle.getLayoutY() + offsetY);

        if (isLineStart) {
            this.line.setStartX(this.line.getStartX() + offsetX);
            this.line.setStartY(this.line.getStartY() + offsetY);
        } else {
            this.line.setEndX(this.line.getEndX() + offsetX);
            this.line.setEndY(this.line.getEndY() + offsetY);
        }

        double a = this.line.getStartX() - this.line.getEndX();
        double b = this.line.getStartY() - this.line.getEndY();

        double distance = Math.sqrt(Math.pow(a,2.0) + Math.pow(b,2.0));

        this.label.setText(String.valueOf(Math.round(distance)));

        this.label.layoutXProperty().bind(this.circle1.centerXProperty().add(this.circle2.centerXProperty()).divide(2));
        this.label.layoutYProperty().bind(this.circle1.centerYProperty().add(this.circle2.centerYProperty()).divide(2));
        this.setMouseStarting(e);
    }

    @FXML
    protected void onCircle1MousePressed(MouseEvent e) {
        this.setMouseStarting(e);
    }
    @FXML
    protected void onCircle1MouseDragged(MouseEvent e) {
        this.mouseElement(e, this.circle1, false);
    }
    @FXML
    protected void onCircle2MousePressed(MouseEvent e) {
        this.setMouseStarting(e);
    }
    @FXML
    protected void onCircle2MouseDragged(MouseEvent e) {
        this.mouseElement(e, this.circle2, true);
    }
}