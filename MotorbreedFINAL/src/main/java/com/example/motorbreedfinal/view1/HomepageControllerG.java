package com.example.motorbreedfinal.view1;

import com.example.motorbreedfinal.Tools.FxmlLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HomepageControllerG {

    @FXML
    private Button customerLoginButton;

    @FXML
    private Label labelLoggedUser;

    @FXML private Button SellerLoginbtn;

    FxmlLoader fxmlLoader = new FxmlLoader();
    @FXML
    void setLoginPage(){
        fxmlLoader.setPage("Login");
    }







}
