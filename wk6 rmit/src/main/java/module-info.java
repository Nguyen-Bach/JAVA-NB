module com.example.wk6rmit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wk6rmit to javafx.fxml;
    exports com.example.wk6rmit;
}