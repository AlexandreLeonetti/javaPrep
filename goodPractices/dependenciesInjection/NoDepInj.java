package goodPractices.dependenciesInjection;

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class Car_ {
    private Engine engine;

    public Car_() {
        engine = new Engine(); // Directly creating the dependency
    }

    public void start() {
        engine.start();
        System.out.println("Car started.");
    }
}

public class NoDepInj{
    public static void main(String[] args) {
        Car_ car = new Car_();
        car.start();
    }
}
