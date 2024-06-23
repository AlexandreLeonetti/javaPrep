package goodPractices.ErrorHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Create a BufferedReader to read from a file
            reader = new BufferedReader(new FileReader("example.txt"));

            // Read and print each line from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the IOException
            System.err.println("An IOException occurred: " + e.getMessage());
        } finally {
            // Ensure the BufferedReader is closed properly
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }
}
