package com.example.demo1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

public class ProgramController implements Initializable {
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
        // Process of picking card
        ArrayList<Integer> num = new ArrayList<>(3);
        int beginBound = 0, endBound = 52;

        int i = 0;
        // Choose a random number for card 1 from 0 to 52
        // Choose a random number for card 2 but need to be different from card 1
        // Choose a random number for card 3 but need to be different from card 1 and 2
        while (i < 3) {
            int n = ThreadLocalRandom.current().nextInt(beginBound, endBound);
            if ((!num.contains(n)) && (!deck.containsKey(n))) {
                deck.put(n, 1);
                num.add(n);
                ++i;
            }
            // if the deck is all used then reset the deck
            // since there will be 52 cards and 3 used each turn
            // We will only have 51 cards used for 17 turns, and then we will reset again
            if (deck.size() == 51) {
                resetDeck();
            }
        }
        // return the three number
        return num;
    }

    private void resetDeck() {
        // Reset the deck
        deck.clear();
    }

    private void setViewCard(ArrayList<Integer> num) {
        // Set card number for card 1, 2 ,3
        card1.setImage(new Image("cards/" + (num.get(0) + 1) + ".png"));
        card2.setImage(new Image("cards/" + (num.get(1) + 1) + ".png"));
        card3.setImage(new Image("cards/" + (num.get(2) + 1) + ".png"));
    }

    private void calculatePoint(ArrayList<Integer> num) {
        // Calculate by init the cal var
        int cal = 0;
        // loop through the value
        for (int j : num) {
            // if the number is greater than 10 then choose 10 else choose the j % 13 + 1
            // This will calculate the card
            cal += Math.min(j % 13 + 1, 10);
        }
        // Set the text for point after calculate
        text.setText(cal + " points");
    }

    @FXML
    private void dealCard() {
        // collect three random number present as card
        ArrayList<Integer> num = pickCard();
        // calculate the point of the 3 numbers
        calculatePoint(num);
        // insert the card with respect to the 3 numbers
        setViewCard(num);
    }

    @FXML
    private void exitClick() {
        // If the button exit press, the program exit
        Platform.exit();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        deck = new HashMap<>();
        // Init the program to deal at the beginning
        dealCard();
    }
}
