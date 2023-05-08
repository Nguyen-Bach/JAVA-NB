module com.example.q4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.q4 to javafx.fxml;
    exports com.example.q4;
}