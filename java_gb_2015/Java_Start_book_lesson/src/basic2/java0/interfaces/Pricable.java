package basic2.java0.interfaces;

public interface Pricable extends Deliverable, Orderable {

    default int calcPrice() {
        return calcDeliveryPrice() + calcOrderPrice();
    }

}
