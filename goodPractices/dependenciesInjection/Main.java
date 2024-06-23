package goodPractices.dependenciesInjection;

public class Main {
    public static void main(String[] args) {
        // Create the dependency outside the Car class
        Engine engine = new Engine();
        
        // Inject the dependency via the constructor
        Car car = new Car(engine);
        
        car.start();
    }
}
