package com.example.motorbreedfinal.Controller;

import com.example.motorbreedfinal.Model.DAO.LoginDao;
import com.example.motorbreedfinal.Model.DAO.AccountDao;
import com.example.motorbreedfinal.Model.Users.Account;
import com.example.motorbreedfinal.Model.factories.UserFactory;
import com.example.motorbreedfinal.view1.Fagioli.LoginBean;

import javax.security.auth.login.FailedLoginException;
import java.sql.SQLException;

public class LoginController {
    public int Login(LoginBean loginBean) throws FailedLoginException, SQLException {

        LoginDao loginDao = new LoginDao();

        String role = loginDao.checkCredentials(loginBean.getEmail(), loginBean.getPassword());

        UserFactory myFactory;

        if(role.equals("Seller")) {
            myFactory = UserFactory.getFactory(UserFactory.ROLE_SELLER);
        }else{
            myFactory = UserFactory.getFactory(UserFactory.ROLE_BUYER);
        }

        Account account = myFactory.createAccount();

        AccountDao accountDao = myFactory.createDAO();

        accountDao.setAccount(account, loginBean.getEmail());

        System.out.println(account);







        if(role.equals("Seller")){
            return 0;
        }else{
            return 1;
        }
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
