
class superClass 
{ 
    public static int calc(int a, int b) 
    { 
        return 0; 
    } 
} 
class subClass extends superClass 
{ 
    public static int calc(int a, int b) 
    { 
        return 1; 
    } 
} 



    public class Gfg 
    { 
        public static void main(String args[]) 
        { 
            //String s1 = new String("geeksforgeeks"); 
            //String s2 = new String("geeksforgeeks"); 
            String s1 = "someString";
            String s2 = "someString";
            if (s1 == s2)  
                System.out.println("Equal"); 
            else
                System.out.println("Not equal"); 
        } 
    } 
 
