package basic2.java0.Inheritance;

public class Truck extends Auto {
    public Truck(String producer, String model, EngineType engineType) {
        super(producer, model, engineType);
        System.out.println("Truck was initialized");
    }
}
