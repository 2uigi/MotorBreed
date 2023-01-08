package com.example.motorbreedfinal.view1;

import com.example.motorbreedfinal.view1.Fagioli.AccountHomepageBean;
import com.example.motorbreedfinal.view1.Fagioli.SellerHomepageBean;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SellerHomepageControllerG {

    @FXML
    private Button insertAdbtn;

    @FXML
    private Button myProfilebtn;

    @FXML
    private static TextField nameSurnameTF;

    /*public void setNameSurnameTF(AccountHomepageBean accountHomepageBean) {
        nameSurnameTF.setText("Welcome " + accountHomepageBean.getFirstName()+ " "+ accountHomepageBean.getLastName());
    }*/

    public void setNameSurnameTF(String name, String surname) {
        nameSurnameTF.setText("Welcome " + name + " "+ surname);
    }
}
