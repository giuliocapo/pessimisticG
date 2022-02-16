module com.example.optimisticg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.optimisticg to javafx.fxml;
    exports com.example.optimisticg;
}