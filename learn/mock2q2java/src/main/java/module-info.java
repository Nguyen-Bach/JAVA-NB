module com.example.mock2q2java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mock2q2java to javafx.fxml;
    exports com.example.mock2q2java;
}