package motorbreed.progetto.Model;

public class HeatedSeats extends VehicleDecorator{
    private String name = "heatedSeats Optional";
    private int Price;

    public HeatedSeats(Vehicle vehicle) {
        super(vehicle);
        this.setPrice(2500);

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
