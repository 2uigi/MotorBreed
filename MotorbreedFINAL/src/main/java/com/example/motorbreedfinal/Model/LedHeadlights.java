package com.example.motorbreedfinal.Model;

public class LedHeadlights extends VehicleDecorator{

    private String name = "ledHeadlights Optional";
    private int Price;

    public LedHeadlights(Vehicle vehicle) {
        super(vehicle);
        this.setPrice(500);

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
