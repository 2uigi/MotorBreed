package com.example.motorbreedfinal.Model;

import java.util.Date;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int Mileage;
    protected Date productionYear;
    protected int horsepower;
    protected String fuelType;
    protected int additionalPrice;

    public abstract int setAdditionalPrice();
}
