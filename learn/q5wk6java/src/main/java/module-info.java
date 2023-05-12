module com.example.q5wk6java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.q5wk6java to javafx.fxml;
    exports com.example.q5wk6java;
}