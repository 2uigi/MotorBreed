package com.example.motorbreedfinal.Model;

import java.util.Date;

public class Ad {
    private String idAd;
    private int cost;
    private String description;
    private String location;
    private Date insertionDate;
    private Car car;
    private Seller seller;

    public Ad(){
        this.car = new Car();
    }
}
