module com.example.fxlesson3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlesson3 to javafx.fxml;
    exports com.example.fxlesson3;
}