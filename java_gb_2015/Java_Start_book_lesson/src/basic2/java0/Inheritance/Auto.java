package basic2.java0.Inheritance;

public class Auto {
    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunnig;

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialized");
    }

    public void start() {
        isRunnig = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop() {
        isRunnig = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + " kmPerHour");

    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunnig() {
        return isRunnig;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", currentSpeed=" + currentSpeed +
                ", isRunnig=" + isRunnig +
                '}';
    }
}
