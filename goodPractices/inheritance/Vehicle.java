package goodPractices.inheritance;
/* super class */
public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
