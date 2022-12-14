module com.example.motorbreedfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.motorbreedfinal to javafx.fxml;
    exports com.example.motorbreedfinal;
    exports com.example.motorbreedfinal.view1;
    opens com.example.motorbreedfinal.view1 to javafx.fxml;
}