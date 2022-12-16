package com.example.motorbreedfinal.view1;

import com.example.motorbreedfinal.Controller.LoginController;
import com.example.motorbreedfinal.view1.Fagioli.LoginBean;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

public class LoginControllerG {
    @FXML
    private ImageView btnFacebook;
    @FXML
    private ImageView btnGoogle;
    @FXML
    private Button btnLogin;
    @FXML
    private Button btnRegisterConcessionaria;
    @FXML
    private Button btnRegisterPrivato;
    @FXML
    private Button lblMotorbreed;
    @FXML
    private ImageView logoMotorbreed;
    @FXML
    private PasswordField pfPassword;
    @FXML
    private TextField tfEmail;
    @FXML
    private Label lblWrongFormat;

    LoginController loginController = new LoginController();

    @FXML
    void setHomepage(ActionEvent event) {
        FxmlLoaderMain.setPage("Homepage");
    }

    @FXML
    void Login() throws FailedLoginException {
        LoginBean loginBean = new LoginBean();              // setting loginBean infos
        loginBean.setEmail(tfEmail.getText());
        loginBean.setPassword(pfPassword.getText());

        if(loginBean.Validation()){

            try {
                if (loginController.Login(loginBean)) {
                    // do();
                }
            } catch (FailedLoginException e) {
                showErrorMessage(e.getMessage());
            }


        } else{
            lblWrongFormat.setVisible(true);
        }
    }

    @FXML
    public void showErrorMessage(String message) {
        lblWrongFormat.setText(message);
        lblWrongFormat.setVisible(true);
    }

    @FXML
    public void registerBuyer(){

    }

    @FXML
    public void registerSeller(){

    }

    @FXML
    public void enableLogin(){
        lblWrongFormat.setVisible(false);
        if(pfPassword.getText().length()>5 && tfEmail.getText().length()>5){
            btnLogin.setDisable(false);
        } else{
            btnLogin.setDisable(true);
        }
    }

    public void failedLogin(){

    }

}
