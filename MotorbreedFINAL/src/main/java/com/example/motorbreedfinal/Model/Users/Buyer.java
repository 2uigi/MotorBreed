package com.example.motorbreedfinal.Model.Users;

import com.example.motorbreedfinal.Model.Ad;
import com.example.motorbreedfinal.Model.Users.Account;

import java.util.List;

public class Buyer extends Account {

    List<Ad> favourites;

    List<Ad> orders;

    public boolean addToFavourites(Ad ad) {
        return true;
    }

    public boolean addToOrders(Ad ad) {
        return true;
    }
}
