package com.example.motorbreedfinal.view1;

import com.example.motorbreedfinal.Controller.LoginController;
import com.example.motorbreedfinal.view1.Fagioli.AccountHomepageBean;
import com.example.motorbreedfinal.view1.Fagioli.LoginBean;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import javax.security.auth.login.FailedLoginException;
import java.io.IOException;
import java.net.URL;
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

    FXMLLoader fxmlLoader;

    AccountHomepageBean accountHomepageBean;
    @FXML
    void setHomepage(ActionEvent event) throws IOException {
        FxmlLoader.setPage("Homepage");
    } // operazione usata al termine del caso d'uso

    @FXML
    void Login() {
        LoginBean loginBean = new LoginBean();              // settaggio parametri LoginBean
        loginBean.setEmail(tfEmail.getText());
        loginBean.setPassword(pfPassword.getText());

        if(loginBean.Validation()){

            try {
                accountHomepageBean = loginController.Login(loginBean);

                if (accountHomepageBean.getRole().equals("Seller")) {
                    SellerHomepageControllerG sellerHomepageControllerG;
                    fxmlLoader = FxmlLoader.setPage("SellerHomepage");
                    sellerHomepageControllerG = fxmlLoader.getController();
                    sellerHomepageControllerG.setNameSurnameTF(accountHomepageBean);

                }else if(accountHomepageBean.getRole().equals("Buyer")) {
                    BuyerHomepageControllerG buyerHomepageControllerG;
                    fxmlLoader = FxmlLoader.setPage("BuyerHomepage");
                    buyerHomepageControllerG = fxmlLoader.getController();
                    buyerHomepageControllerG.setNameSurnameTF(accountHomepageBean);
                }

            } catch (FailedLoginException e) {
                showErrorMessage(e.getMessage());
            } catch (SQLException | IOException e) {
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
        FxmlLoader.setPage("RegisterPrivatoPage");
    }

    @FXML
    public void registerSeller(){
        FxmlLoader.setPage("RegisterConcessionariaPage");
    }

    @FXML
    public void enableLogin(){
        lblWrongFormat.setVisible(false);
        btnLogin.setDisable(pfPassword.getText().length() <= 5 || tfEmail.getText().length() <= 5);
    }

    public void failedLogin(){

    }

}
