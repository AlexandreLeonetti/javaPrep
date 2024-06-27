package guess;

public class a1 {
    public static void main(String[] args){
        String og = "opengenus";
        String og2 = new String(og);

        System.out.println(og + " " + og2);
        System.out.println((og==og2) + "  "+ (og.equals(og2)));


        System.out.println(og + " " + og2);
        System.out.println("og == og2: " + (og == og2));
        System.out.println("og.equals(og2): " + og.equals(og2));
    }
    
}

/*
 * 
System.out.println(og == og2 + "  " + (og.equals(og2)));
// Evaluates as:
// System.out.println(og == ("opengenus  " + og.equals(og2)));
// Which is equivalent to:
// System.out.println(og == "opengenus  true");
// Result: false 


System.out.println((og == og2) + "  " + (og.equals(og2)));
// Evaluates as:
// System.out.println("false" + "  " + "true");
// Result: false  true

== is reference equality
.equals() value equality
 * 
 * 
 */