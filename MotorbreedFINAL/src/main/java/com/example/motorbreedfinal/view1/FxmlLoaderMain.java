package com.example.motorbreedfinal.view1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;



public class FxmlLoaderMain extends Application {

    private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FxmlLoaderMain.class.getResource("Homepage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage = primaryStage;
        stage.setTitle("MotorBreed");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



    public static void setPage(String fileName) {
        try {
            URL fileUrl = FxmlLoaderMain.class.getResource(fileName + ".fxml");
            if (fileUrl == null) {
                //scrivi try catch per raccogliere questa giovane eccezione 
            }
            Parent root = FXMLLoader.load(fileUrl);
            Scene scene = new Scene(root, 1280, 720);
            stage.setScene(scene);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}


