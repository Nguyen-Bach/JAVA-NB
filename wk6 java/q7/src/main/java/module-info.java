module com.example.q7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.q7 to javafx.fxml;
    exports com.example.q7;
}