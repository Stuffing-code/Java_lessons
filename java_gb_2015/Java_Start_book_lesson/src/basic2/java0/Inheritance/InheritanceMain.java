package basic2.java0.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Truck auto = new Truck("Mercedes", "Sprinter", EngineType.DESEL);
        System.out.println(auto.getProducer());
        System.out.println(auto.getModel());
    }
}
