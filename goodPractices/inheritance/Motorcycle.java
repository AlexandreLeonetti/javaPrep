package goodPractices.inheritance;
/*sub class*/
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year); // Call the constructor of the superclass
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        super.start(); // Optionally call the superclass method
        System.out.println("Motorcycle is starting.");
    }

    @Override
    public void stop() {
        super.stop(); // Optionally call the superclass method
        System.out.println("Motorcycle is stopping.");
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
