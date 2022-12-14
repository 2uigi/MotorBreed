package com.example.motorbreedfinal.Model;

public abstract class VehicleDecorator extends Vehicle{
    private Vehicle vehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int setAdditionalPrice() {
        int PriceFromRedirection = this.vehicle.setAdditionalPrice();
        return PriceFromRedirection;
    }
}
