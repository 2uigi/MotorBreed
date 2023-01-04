package com.example.motorbreedfinal.Controller;

import com.example.motorbreedfinal.Model.DAO.LoginDao;
import com.example.motorbreedfinal.Model.DAO.AccountDao;
import com.example.motorbreedfinal.Model.Users.Account;
import com.example.motorbreedfinal.Model.factories.UserFactory;
import com.example.motorbreedfinal.view1.Fagioli.AccountHomepageBean;
import com.example.motorbreedfinal.view1.Fagioli.LoginBean;
import com.example.motorbreedfinal.view1.Fagioli.SellerHomepageBean;
import com.example.motorbreedfinal.view1.SellerHomepageControllerG;

import javax.security.auth.login.FailedLoginException;
import java.sql.SQLException;

public class LoginController {
    public int Login(LoginBean loginBean) throws FailedLoginException, SQLException {

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

        if(role.equals("Seller")){
            SellerHomepageControllerG.setLabelLoggedUser(accountHomepageBean);
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
