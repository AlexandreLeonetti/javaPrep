package guess;

public class a15 {
    public static void main(String[] arr){
        //Integer num1 = 400;
        //Integer num2 = 400;

        String num1 = "400";
        String num2 = "400";

        if(num1 == num2){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}

/*
 * autoboxing for identical literals 
 * 
 * Integer class support the range of -128 to 127. If the number is within the range, autoboxing is applied. This means the same reference is assigned for the same number as they are from the same pool. As 400 is outside the range, different references are assigned.

 */