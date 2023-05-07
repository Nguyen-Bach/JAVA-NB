module com.example.q3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.q3 to javafx.fxml;
    exports com.example.q3;
}