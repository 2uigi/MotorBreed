package com.example.motorbreedfinal.view1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HomepageControllerG {

    @FXML
    private Button customerLoginButton;

    @FXML
    private Label labelLoggedUser;

    @FXML private Button SellerLoginbtn;
    @FXML
    void setLoginPage() throws IOException {
        FxmlLoader.setPage("LoginPage");
    }







}
