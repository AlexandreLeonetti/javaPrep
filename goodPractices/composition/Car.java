package goodPractices.composition;

public class Car {
    private Engine engine;
    private Transmission transmission;

    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public void start() {
        engine.start();
        transmission.engage();
        System.out.println("Car is starting.");
    }

    public void stop() {
        transmission.disengage();
        engine.stop();
        System.out.println("Car is stopping.");
    }

    // Getters for engine and transmission
    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
