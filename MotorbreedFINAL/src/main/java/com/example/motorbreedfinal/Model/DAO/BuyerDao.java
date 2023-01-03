package com.example.motorbreedfinal.Model.DAO;

public class BuyerDao extends AccountDao {

    @Override
    public void retrieveUserInfo() {
        retrieveBuyerOrders();
        retrieveBuyerInfo();
        retrieveBuyerFavourites();
    }

    private void retrieveBuyerFavourites() {
    }

    private void retrieveBuyerInfo() {
    }

    private void retrieveBuyerOrders() {
    }
}
