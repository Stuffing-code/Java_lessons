package basic2.java0.interfaces;

public abstract class Electronics implements Pricable {

    private String make;
    private String model;
    private int quantity;
    private double price;

    public Electronics(String make, String model, int quantity, double price) {
        this.make = make;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int calcOrderPrice() {
        return (int) (getQuantity() * getPrice());
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
