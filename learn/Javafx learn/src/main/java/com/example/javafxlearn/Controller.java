package com.example.javafxlearn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;



   public void Up(ActionEvent e) {
        myCircle.setCenterY(y = y - 3);
   }
    public void Down(ActionEvent e) {
        myCircle.setCenterY(y = y + 3);
    }public void Right(ActionEvent e) {
        myCircle.setCenterX(x = x + 3);
    }public void Left(ActionEvent e) {
        myCircle.setCenterX(x = x - 3);
    }
}