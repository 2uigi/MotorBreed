package com.example.motorbreedfinal.Model;

import java.util.Date;

public class Car extends Vehicle{
    private String idCar;
    private String licencePlate;
    private String transmission;
    private boolean insurance;
    private Date immatricolationYear;

    @Override
    public int setAdditionalPrice() {
        return 0;
    }
}
