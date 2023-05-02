module com.example.javafxlearn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxlearn to javafx.fxml;
    exports com.example.javafxlearn;
}