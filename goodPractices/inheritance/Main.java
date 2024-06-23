package goodPractices.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, "Corolla");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2018, true);

        System.out.println("Car brand: " + car.getBrand());
        System.out.println("Car model: " + car.getModel());
        car.start();
        car.stop();

        System.out.println("Motorcycle brand: " + motorcycle.getBrand());
        System.out.println("Has sidecar: " + motorcycle.hasSidecar());
        motorcycle.start();
        motorcycle.stop();
    }
}

