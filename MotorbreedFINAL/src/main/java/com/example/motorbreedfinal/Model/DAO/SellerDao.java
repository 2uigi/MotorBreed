package com.example.motorbreedfinal.Model.DAO;

public class SellerDao extends UserDAO{

    @Override
    public void retrieveUserInfo(){
        retrieveSellerInfo();
        retrieveSellerAds();
        retrieveSellerRatings();
    }

    private void retrieveSellerRatings() {
    }

    private void retrieveSellerAds() {
    }

    private void retrieveSellerInfo() {
    }
}
