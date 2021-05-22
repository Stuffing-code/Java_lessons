package basic2.java0.interfaces;

public class CellPhone extends Electronics {

    public CellPhone(String make, String model, int quantity, double price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if (getPrice() >= 150) {
            return 0;
        } else {
            return 10;
        }
    }


}
