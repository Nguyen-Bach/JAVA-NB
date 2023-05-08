module com.example.q5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.q5 to javafx.fxml;
    exports com.example.q5;
}