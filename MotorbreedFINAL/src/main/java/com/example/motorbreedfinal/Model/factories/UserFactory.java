package com.example.motorbreedfinal.Model.factories;

import com.example.motorbreedfinal.Model.Users.Account;
import com.example.motorbreedfinal.Model.DAO.AccountDao;

public abstract class UserFactory {

    public static final String ROLE_SELLER = "Seller";

    public static final String ROLE_BUYER = "Buyer";

    public static UserFactory getFactory(String s) {
        if(s.equals(ROLE_SELLER)){
            return new SellerFactory();

        }else {
            return new BuyerFactory();
        }
    }

    public abstract Account createAccount();

    public abstract AccountDao createDAO();
}
