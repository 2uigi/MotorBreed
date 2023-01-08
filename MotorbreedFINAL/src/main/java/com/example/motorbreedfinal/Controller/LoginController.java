package com.example.motorbreedfinal.Controller;

import com.example.motorbreedfinal.Model.DAO.LoginDao;
import com.example.motorbreedfinal.Model.DAO.AccountDao;
import com.example.motorbreedfinal.Model.Users.Account;
import com.example.motorbreedfinal.Model.factories.UserFactory;
import com.example.motorbreedfinal.view1.Fagioli.AccountHomepageBean;
import com.example.motorbreedfinal.view1.Fagioli.LoginBean;

import javax.security.auth.login.FailedLoginException;
import java.io.IOException;
import java.sql.SQLException;

public class LoginController {
    public AccountHomepageBean Login(LoginBean loginBean) throws FailedLoginException, SQLException, IOException {

        LoginDao loginDao = new LoginDao(); // creazione loginDao per trovare role

        String role = loginDao.checkCredentials(loginBean.getEmail(), loginBean.getPassword());

        UserFactory myFactory;

        // sezione di codice polimorfo per istanziare oggetti di tipo buyer/seller e i rispettivi Dao

        if(role.equals("Seller")) {
            myFactory = UserFactory.getFactory(UserFactory.ROLE_SELLER);
        }else{
            myFactory = UserFactory.getFactory(UserFactory.ROLE_BUYER);
        }

        Account account = myFactory.createAccount();
        AccountDao accountDao = myFactory.createDAO();
        accountDao.setAccount(account, loginBean.getEmail());

        AccountHomepageBean accountHomepageBean = new AccountHomepageBean();
        accountHomepageBean.setFirstName(account.getFirstName());
        accountHomepageBean.setLastName(account.getLastName());
        accountHomepageBean.setRole(role);

        return accountHomepageBean;
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
