package motorbreed.progetto.Model;

public class CruiseControl extends VehicleDecorator{
    private String name = "CruiseControl Optional";
    private int Price;

    public CruiseControl(Vehicle vehicle) {
        super(vehicle);
        this.setPrice(600);

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
