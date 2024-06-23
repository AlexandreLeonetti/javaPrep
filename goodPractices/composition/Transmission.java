package goodPractices.composition;


public class Transmission {
    private String type;

    public Transmission(String type) {
        this.type = type;
    }

    public void engage() {
        System.out.println("Transmission of type " + type + " is engaging.");
    }

    public void disengage() {
        System.out.println("Transmission of type " + type + " is disengaging.");
    }

    // Getter for type
    public String getType() {
        return type;
    }
}
