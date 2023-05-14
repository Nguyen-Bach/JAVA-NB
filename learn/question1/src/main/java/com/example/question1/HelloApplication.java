/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2023A
  Assessment: Test 2
  Author: Nguyen Duy Bach
  ID: s399639
  Created  date: 13/5/2023
  Acknowledgement: Acknowledge the resources that you use here.
*/

package com.example.question1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    private Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Scene scene = Splash();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Scene Splash() {         //splash scene
        Pane pane = new Pane();

        //creating label and button
        Label programName = new Label("Question 1 GUI");
        programName.setLayoutX(125);
        programName.setLayoutY(25);

        Button newForm = new Button("new Form");
        newForm.setLayoutX(50);
        newForm.setLayoutY(100);

        Button displayDialog = new Button("Display Dialog");
        displayDialog.setLayoutX(200);
        displayDialog.setLayoutY(100);

        //change scene when press button
        displayDialog.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(dialog());
            }
        });
        newForm.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                stage.setScene(createForm());
            }
        });
        pane.getChildren().add(programName);
        pane.getChildren().add(displayDialog);
        pane.getChildren().add(newForm);
        return new Scene(pane,350,200);
    }
    protected Scene dialog() {          //scene to display dialog
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(25,25,25,25));

        Label label = new Label();
        label.setText("This is a GUI program that takes personal information and store the data to a file");
        pane.add(label,1,1);


        //button to change scene back to splash when pressed
        Button returnButton = new Button("Return");
        returnButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(Splash());
            }
        });
        pane.add(returnButton,1,2);
        return new Scene(pane);
    };
    protected Scene createForm() {          //scene to input information
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(25, 25, 25, 25));


        //adding label and text-field
        Label name = new Label("Name\t");
        TextField userName = new TextField();
        pane.add(name,0,1);
        pane.add(userName, 2,1);

        Label address = new Label("Address\t");
        TextField userAddress = new TextField();
        pane.add(address,0,2);
        pane.add(userAddress,2,2);

        Label age = new Label("Age\t");
        TextField userAge = new TextField();
        pane.add(age,0,3);
        pane.add(userAge,2,3);

        Label occupation = new Label("Occupation\t");
        TextField userOccupation = new TextField();
        pane.add(occupation,0,4);
        pane.add(userOccupation,2,4);

        Button submit = new Button("Submit form");
        pane.add(submit,2,5);

        submit.setOnAction(new EventHandler<ActionEvent>() {        //if value is validated when button is pressed, success scene will be display
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(successScene());
            }
        });

        name.focusedProperty().addListener(e -> {
            if(name.getText() == null || name.getText().matches("[1-9]")) {

            }
        });

        return new Scene(pane);
    }

    protected Scene successScene() {
        Pane pane = new Pane();

        Label success = new Label("Success");
        success.setLayoutX(125);
        success.setLayoutY(150);

        Label programName = new Label("Question 1 GUI");
        programName.setLayoutX(125);
        programName.setLayoutY(25);

        Button newForm = new Button("new Form");
        newForm.setLayoutX(50);
        newForm.setLayoutY(100);

        Button displayDialog = new Button("Display Dialog");
        displayDialog.setLayoutX(200);
        displayDialog.setLayoutY(100);

        displayDialog.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(dialog());
            }
        });
        newForm.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                stage.setScene(createForm());
            }
        });

        pane.getChildren().add(success);
        pane.getChildren().add(programName);
        pane.getChildren().add(displayDialog);
        pane.getChildren().add(newForm);
        return new Scene(pane,350,200);
    }

}












