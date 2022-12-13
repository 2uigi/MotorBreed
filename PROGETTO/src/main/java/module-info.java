module motorbreed.progetto {
    requires javafx.controls;
    requires javafx.fxml;


    opens motorbreed.progetto to javafx.fxml;
    exports motorbreed.progetto;
}