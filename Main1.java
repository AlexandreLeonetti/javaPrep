import java.util.HashMap;

class StringUtils {

    /**
     * Concatenates the given array of strings.
     * @param strings An array of strings to concatenate.
     * @return A single string resulting from concatenation of all the strings in the array.
     */
    static String concat(String[] strings) {
        // Initialize a StringBuilder to efficiently concatenate strings
        StringBuilder result = new StringBuilder();

        // Iterate through the array of strings and append each one to the StringBuilder
        for (String str : strings) {
            result.append(str);
        }

        // Convert the StringBuilder to a String and return the result
        return result.toString();
    }

}
public class Main1{
    public static void main(String[] args){
        String[] testArray = {"f","o","o"};
        String res = StringUtils.concat(testArray);
        System.out.println(res);
    }

}