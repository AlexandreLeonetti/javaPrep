package goodPractices.composition;
public class Engine {
    private String type;
    
    public Engine(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println("Engine of type " + type + " is starting.");
    }
    
    public void stop() {
        System.out.println("Engine of type " + type + " is stopping.");
    }

    // Getter for type
    public String getType() {
        return type;
    }
}
