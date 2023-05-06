package com.example.wk6rmit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private final String[] URLS = {
            "C:\\Users\\Username\\Documents\\GitHub\\JAVA-NB\\wk6 rmit\\src\\main\\resources\\com\\example\\wk6rmit\\255px-Flag_of_the_United_States.svg.png",
            "C:\\Users\\Username\\Documents\\GitHub\\JAVA-NB\\wk6 rmit\\src\\main\\resources\\com\\example\\wk6rmit\\Flag_of_the_United_Kingdom_(1-2).svg.png",
            "C:\\Users\\Username\\Documents\\GitHub\\JAVA-NB\\wk6 rmit\\src\\main\\resources\\com\\example\\wk6rmit\\Untitled.jpg",
            "C:\\Users\\Username\\Documents\\GitHub\\JAVA-NB\\wk6 rmit\\src\\main\\resources\\com\\example\\wk6rmit\\pizza.jpg"
    };


    public static void main(String[] args) {
        launch();
    }

//    private GridPane createGridPane(ImageView[] ivs) {
//        GridPane gridPane = new GridPane();
//        gridPane.add(ivs[0], 1 , 1);
//        gridPane.add(ivs[1], 1,2);
//        gridPane.add(ivs[2], 2,1);
//        gridPane.add(ivs[3], 2, 2);
//        return gridPane;
//    };

    private ImageView[] createImages() {
        ImageView[] ivs = new ImageView[URLS.length];
        for (int i = 0; i < 4; i++) {
            ivs[i] = new ImageView(URLS[i]);
            ivs[i].setFitWidth(300);
            ivs[i].setPreserveRatio(true);
            ivs[i].setSmooth(true);
        }
        return ivs;
    };
    @Override
    public void start(Stage Primarystage) throws Exception {
        ImageView[] imageView = createImages();
        GridPane gridpane = new GridPane();
        gridpane.add(imageView[0], 1,1);
        gridpane.add(imageView[1], 1,2);
        gridpane.add(imageView[2], 2,1);
        gridpane.add(imageView[3], 2,2);
        Scene scene = new Scene(gridpane);
        Stage stage = new Stage();
        stage.setTitle("Flags");
        stage.setScene(scene);
        stage.show();


    }
}