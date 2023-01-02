package com.example.motorbreedfinal.Model.factories;

import com.example.motorbreedfinal.Model.Users.Account;
import com.example.motorbreedfinal.Model.DAO.SellerDao;
import com.example.motorbreedfinal.Model.DAO.UserDAO;
import com.example.motorbreedfinal.Model.Users.Seller;

public class SellerFactory extends UserFactory {

    @Override
    public Account createAccount() {
        return new Seller();
    }

    @Override
    public UserDAO createDAO() {
        return new SellerDao();
    }
}
