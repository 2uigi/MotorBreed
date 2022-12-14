package com.example.motorbreedfinal.Tools;

import com.example.motorbreedfinal.view1.HomepageControllerG;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FxmlLoader {

    private Pane view;

    public Pane setPage(String fileName) {
        try {
            URL fileUrl = HomepageControllerG.class.getResource(fileName + ".fxml");
            if (fileUrl == null){
                //tira n eccezzione deddio
            }
            new FXMLLoader();
            view = FXMLLoader.load(fileUrl);
        } catch(Exception e) {
            //fai qualcosa
        }

        return view;
    }

}
