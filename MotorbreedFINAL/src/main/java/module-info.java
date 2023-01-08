module com.example.motorbreedfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires mysql.connector.j;


    exports com.example.motorbreedfinal.view1;
    exports com.example.motorbreedfinal.view1.Fagioli;
    opens com.example.motorbreedfinal.view1 to javafx.fxml;
}