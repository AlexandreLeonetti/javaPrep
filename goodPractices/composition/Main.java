package goodPractices.composition;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Transmission transmission = new Transmission("Automatic");

        Car car = new Car(engine, transmission);

        car.start(); // This will start the engine and engage the transmission
        car.stop();  // This will disengage the transmission and stop the engine
    }
}

