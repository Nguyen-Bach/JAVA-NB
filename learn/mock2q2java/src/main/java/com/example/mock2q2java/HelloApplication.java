package com.example.mock2q2java;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox(5);

        HBox pane = new HBox(5);
        pane.setPadding(new Insets(5,5,5,5));

        setCards(pane, getCards());

        HBox paneForButton = new HBox(5);
        paneForButton.setAlignment(Pos.CENTER);

        Button deal = new Button("Deal");
        Button exit = new Button("Exit");

        paneForButton.getChildren().addAll(deal,exit);

        BorderPane bPane = new BorderPane();
        bPane.setCenter(pane);
        bPane.setBottom(paneForButton);

        deal.setOnAction(actionEvent -> {
            pane.getChildren().clear();
            setCards(pane,getCards());
        });
        exit.setOnAction(actionEvent -> {
            Platform.exit();
        });

        vBox.getChildren().addAll(pane,bPane);
        Scene scene = new Scene(vBox);
        stage.setTitle("q2");
        stage.setScene(scene);
        stage.show();
    }

    private void setCards(Pane pane, ArrayList<Integer> cards) {
        for (int i = 0; i < 3; i++) {
            pane.getChildren().add(new ImageView(
                    new Image("C:\\Users\\Username\\Documents\\G" +
                            "itHub\\JAVA-NB\\learn\\mock" +
                            "2q2java\\src\\main\\resources\\" +
                            "com\\example\\mock2q2java\\" +
                            "cards\\" + cards.get(i) + ".png")));
        }

    }
    private ArrayList<Integer> getCards() {
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i + 1);
        }
        java.util.Collections.shuffle(cards);
        return cards;
    }
}