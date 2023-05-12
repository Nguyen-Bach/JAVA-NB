module com.example.javamock21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javamock21 to javafx.fxml;
    exports com.example.javamock21;
}