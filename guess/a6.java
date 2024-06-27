package guess;

public class a6 {
    public static void main(String args[]){
        double d1 = 5f; // c1
        double d2 = 5.0; // c2
        float f1 = 5f; // c3
        float f2 = 4.01; // c4 does not compile because, the literal 4.01 is considered as double by java by default
        // needs expliciting casting from double to float.
    }
    
}
