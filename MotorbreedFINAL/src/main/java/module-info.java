module com.example.motorbreedfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires mysql.connector.j;


    exports com.example.motorbreedfinal.view1;
    opens com.example.motorbreedfinal.view1 to javafx.fxml;
}