package com.example.motorbreedfinal.view1;

import com.example.motorbreedfinal.Controller.LoginController;
import com.example.motorbreedfinal.view1.Fagioli.LoginBean;
import com.example.motorbreedfinal.view1.Fagioli.SellerHomepageBean;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;
import java.sql.SQLException;

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

    LoginController loginController = new LoginController(); // istanziamo il controller applicativo

    @FXML
    void setHomepage(ActionEvent event) {
        FxmlLoaderMain.setPage("Homepage");
    } // operazione usata al termine del caso d'uso

    @FXML
    void Login() {
        LoginBean loginBean = new LoginBean();              // settaggio parametri LoginBean
        loginBean.setEmail(tfEmail.getText());
        loginBean.setPassword(pfPassword.getText());

        if(loginBean.Validation()){

            try {
                int result = loginController.Login(loginBean);

                if ( result== 0 ) {
                    FxmlLoaderMain.setPage("SellerHomepage");
                }else if(result == 1) {
                    FxmlLoaderMain.setPage("BuyerHomepage");
                }



            } catch (FailedLoginException e) {
                showErrorMessage(e.getMessage());
            } catch (SQLException e) {
                throw new RuntimeException(e);
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
