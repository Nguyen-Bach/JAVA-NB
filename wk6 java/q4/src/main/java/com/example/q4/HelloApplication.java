package com.example.q4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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

        Button DealButton = new Button("Deal");
        Button exitButton = new Button("exit");

        paneForButton.getChildren().addAll(DealButton, exitButton);

        BorderPane bPane = new BorderPane();
        bPane.setCenter(pane);
        bPane.setBottom(paneForButton);

        DealButton.setOnAction(actionEvent -> {
            pane.getChildren().clear();
            setCards(pane, getCards());
        });

        exitButton.setOnAction(actionEvent -> {
            Platform.exit();
        });

        vBox.getChildren().addAll(pane, bPane);
        Scene scene = new Scene(vBox);
        stage.setTitle("q4");
        stage.setScene(scene);
        stage.show();
    }

    private void setCards(Pane pane, ArrayList<Integer> cards) {
        for (int i = 0; i < 3; i++) {
            pane.getChildren().add(new ImageView(new Image(
                    "C:\\Users\\Username\\Downloads\\cards\\cards\\" + cards.get(i) + ".png")));
        }
    }

    private ArrayList<Integer> getCards () {
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i + 1);
        }
        java.util.Collections.shuffle(cards);
        return cards;
    }
}