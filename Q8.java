import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q8 {
    public static void main(String[] args) {
        String sourceFilePath = "Q6.txt"; 
        String destinationFilePath = "Q8.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             FileWriter writer = new FileWriter(destinationFilePath)) 
            {
                String line;
                while ((line = reader.readLine()) != null) 
                {
                    writer.write(line);
                    writer.write(System.lineSeparator());
                }
                System.out.println("Content copied successfully from " + sourceFilePath + " to " + destinationFilePath);
            } 
            catch (IOException e) 
            {
                System.out.println("An error occurred while copying the file: " + e.getMessage());
            }
    }
}
