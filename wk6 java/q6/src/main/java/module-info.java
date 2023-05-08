module com.example.q6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.q6 to javafx.fxml;
    exports com.example.q6;
}