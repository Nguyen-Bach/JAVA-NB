package com.example.q3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class q3 extends Application {







    private double getMax(double[] l) {
        double max = l[0];
        for (int i = 1; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        return max;
    };

    private VBox getVbox(Text t, Rectangle r) {
        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.BOTTOM_LEFT);
        vbox.getChildren().addAll(t, r);
        return vbox;
    }


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage Primarystage) throws Exception {
        HBox hBox = new HBox(15);
        hBox.setAlignment(Pos.BOTTOM_CENTER);

        String[] type = {"Project", "Quiz", "Midterm", "Final"};

        double [] grade = {20,10,30,40};

        double max = getMax(grade);

        double height = 200;
        double width = 150;

        StackPane pane = new StackPane();
        pane.setPadding(new Insets(20, 15, 5, 15));

        Rectangle rec1 = new Rectangle(0,0, width, height * grade[0] / max);
        rec1.setFill(Color.RED);
        Rectangle rec2 = new Rectangle(0,0, width, height * grade[1] / max);
        rec2.setFill(Color.GREEN);
        Rectangle rec3 = new Rectangle(0,0, width, height * grade[2] / max);
        rec3.setFill(Color.YELLOW);
        Rectangle rec4 = new Rectangle(0,0, width, height * grade[3] / max);
        rec4.setFill(Color.BLUE);

        Text t1 = new Text(0,0, "\t" + type[0] + "--" + grade[0] + "%");
        Text t2 = new Text(0,0, "\t" + type[1] + "--" + grade[1] + "%");
        Text t3 = new Text(0,0, "\t" + type[2] + "--" + grade[2] + "%");
        Text t4 = new Text(0,0, "\t" + type[3] + "--" + grade[3] + "%");

        hBox.getChildren().addAll(getVbox(t1, rec1),getVbox(t2, rec2),getVbox(t3, rec3),getVbox(t4, rec4));

        pane.getChildren().addAll(hBox);

        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("q3");
        stage.show();
    }
}