package com.example.demo1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

public class HelloController {
    @FXML
    private Button deal;
    @FXML
    private Button exit;
    @FXML
    private ImageView card1;
    @FXML
    private ImageView card2;
    @FXML
    private ImageView card3;
    @FXML
    private Text text;

    private HashMap<Integer, Integer> deck;



    private ArrayList<Integer> pickCard() {
        ArrayList<Integer> num = new ArrayList<>(3);
        int beginBound = 0, endBound = 52;

        int i = 0;

        if (i < 3) {
            int n = ThreadLocalRandom.current().nextInt(beginBound, endBound);
            if ((!num.contains(n)) && (!deck.containsKey(n))) {
                deck.put(n,1);
                num.add(n);
                ++i;
            }

            if (deck.size() == 51) {
                resetDeck();
            }
        }

        return num;
    }

    private void resetDeck() {
        deck.clear();
    }

    private void setViewCard(ArrayList<Integer> num) {
        card1.setImage(new Image("C:\\Users\\Username\\D" +
                "ownloads\\cards(1)\\" +
                "cards\\" + (num.get(0) + 1) +".png"));
        card2.setImage(new Image("C:\\Users\\Username\\D" +
                "ownloads\\cards(1)\\" +
                "cards\\" + (num.get(1) + 1) +".png"));
        card3.setImage(new Image("C:\\Users\\Username\\D" +
                "ownloads\\cards(1)\\" +
                "cards\\" + (num.get(2) + 1) +".png"));
    }

    private void calculatePoint(ArrayList<Integer> num) {
        int cal = 0;

        for (int j : num) {
            cal += Math.min(j % 13 + 1, 10);
        }
        text.setText(cal + " points");
    }

    @FXML
    private void dealCard() {
        ArrayList<Integer> num = pickCard();

        calculatePoint(num);
        setViewCard(num);
    }
    @FXML
    private void exitClick() {
        Platform.exit();
    }

    public void initialize(URL location, ResourceBundle resources) {
        deck = new HashMap<>();

        dealCard();
    }
}