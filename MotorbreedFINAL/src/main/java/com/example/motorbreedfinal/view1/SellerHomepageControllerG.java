package com.example.motorbreedfinal.view1;

import com.example.motorbreedfinal.view1.Fagioli.AccountHomepageBean;
import com.example.motorbreedfinal.view1.Fagioli.SellerHomepageBean;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SellerHomepageControllerG {

    @FXML
    private Button insertAdbtn;

    @FXML
    private static Label labelLoggedUser;

    @FXML
    private Button myProfilebtn;

    public static void setLabelLoggedUser(AccountHomepageBean accountHomepageBean) {
        labelLoggedUser.setText("Welcome " + accountHomepageBean.getFirstName()+ " "+ accountHomepageBean.getLastName());
    }

}
