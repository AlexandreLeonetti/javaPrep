import java.util.HashMap;
import java.util.Scanner;

class Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Console> Java Echo ");
        String input = scanner.nextLine(); // Read the entire line of input

        String[] words = input.split(" "); // Split the input into words

        for (String word : words) {
            System.out.println(word); // Print each word on a new line
        }

        scanner.close();
    }
}

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
        Echo e1 = new Echo();
    }

}