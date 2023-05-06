package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage Primarystage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        Stage stage = new Stage();

        Text text = new Text("loollll");
        text.setX(10);
        text.setY(30);

        Rectangle rec = new Rectangle(60, 60);
        rec.setFill(Color.YELLOW);
        rec.setX(50);
        rec.setY(50);

        Circle cir = new Circle();
        cir.setCenterX(250);
        cir.setCenterY(250);
        cir.setFill(Color.BLUE);
        cir.setRadius(40);

        Image image = new Image("C:\\Users\\Username\\Documents\\GitHub\\JAVA-NB\\HelloFX\\src\\pizza.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        stage.setScene(scene);
        root.getChildren().add(rec);
        root.getChildren().add(text);
        root.getChildren().add(cir);
        root.getChildren().add(imageView);
        stage.show();
    }
}