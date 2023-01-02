package com.example.motorbreedfinal.Model;

import com.example.motorbreedfinal.Model.Users.Seller;

import java.util.Date;

public class Ad {
    private String idAd;
    private int cost;
    private String description;
    private String location;
    private Date insertionDate;
    private int numberOfClicks;
    private Car car;
    private Seller seller;

    public Ad(){
        this.car = new Car();
    }
}
