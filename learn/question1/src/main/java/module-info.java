module com.example.question1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.question1 to javafx.fxml;
    exports com.example.question1;
}