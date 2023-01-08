package com.example.motorbreedfinal.view1;

import com.example.motorbreedfinal.view1.Fagioli.AccountHomepageBean;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BuyerHomepageControllerG {

    @FXML
    private Button buyCarbtn;

    @FXML
    private Label labelLoggedUser;

    @FXML
    private Button myProfilebtn;

    @FXML
    private TextField nameSurnameTF;

    public void setNameSurnameTF(AccountHomepageBean accountHomepageBean) {
        nameSurnameTF.setText("Welcome " + accountHomepageBean.getFirstName()+ " "+ accountHomepageBean.getLastName());
    }
}
