package com.example.motorbreedfinal.Model;

public class KeylessSystem extends  VehicleDecorator{

    private String name = "keyless Optional";
    private int Price;

    public KeylessSystem(Vehicle vehicle) {
        super(vehicle);
        this.setPrice(2000);

    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    protected int applyPrice(int input) {

        int output = this.Price + input;
        return output;
    }

    @Override
    public int setAdditionalPrice() {
        int preliminaryResults = super.setAdditionalPrice();
        preliminaryResults = this.applyPrice(preliminaryResults);
        return preliminaryResults;
    }
}
