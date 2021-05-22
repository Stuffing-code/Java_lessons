package basic2.java0.interfaces;

public class Fridge extends Electronics {

    public Fridge(String make, String model, int quantity, double price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if (getPrice() >= 300) {
            return 0;
        } else {
            return 25;
        }
    }

}
