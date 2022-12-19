package com.example.motorbreedfinal.Controller;

import com.example.motorbreedfinal.Model.DAO.LoginDao;
import com.example.motorbreedfinal.view1.Fagioli.LoginBean;

import javax.security.auth.login.FailedLoginException;

public class LoginController {


    public boolean Login(LoginBean loginBean) throws FailedLoginException {

        LoginDao loginDao = new LoginDao();

        String role;

        role = loginDao.checkCredentials(loginBean.getEmail(), loginBean.getPassword());

        if(role.equals("Seller") || role.equals("Buyer")) {
            //AbstractFactory.createAccount(loginBean.getEmai
        }
        return false;
    }


    public void buyerSignIn(){

    }

    public void sellerSignIn() {

    }

    public void facebookLogin(){

    }

    public void googleLogin() {

    }

}
