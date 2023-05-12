module com.example.q5wk8java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.q5wk8java to javafx.fxml;
    exports com.example.q5wk8java;
}