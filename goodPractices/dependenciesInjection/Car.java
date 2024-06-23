package goodPractices.dependenciesInjection;

class Car {
    private Engine engine;

    // Dependency is injected via the constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car started.");
    }
}

