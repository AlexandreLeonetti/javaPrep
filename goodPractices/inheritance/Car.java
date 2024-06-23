package goodPractices.inheritance;
/* sub class */
public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year); // Call the constructor of the superclass
        this.model = model;
    }

    @Override
    public void start() {
        super.start(); // Optionally call the superclass method
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        super.stop(); // Optionally call the superclass method
        System.out.println("Car is stopping.");
    }

    public String getModel() {
        return model;
    }
}
