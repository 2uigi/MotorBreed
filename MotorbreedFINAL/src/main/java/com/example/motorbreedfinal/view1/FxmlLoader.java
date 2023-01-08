package com.example.motorbreedfinal.view1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class FxmlLoader extends Application {

    private static Stage stage;
    private static FXMLLoader fxmlLoader;

    @Override
    public void start(Stage primaryStage) throws IOException {
        fxmlLoader = new FXMLLoader(FxmlLoader.class.getResource("Homepage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage = primaryStage;
        stage.setTitle("MotorBreed");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static FXMLLoader setPage(String fileName) {
        try {
            URL fileUrl = FxmlLoader.class.getResource(fileName + ".fxml");
            FXMLLoader loader = new FXMLLoader(fileUrl);
            assert fileUrl != null;
            Parent root = loader.load(fileUrl);
            
            Scene scene = new Scene(root, 1280, 720);
            stage.setScene(scene);
            return loader;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    public static void main(String[] args) {
        launch();
    }
}


