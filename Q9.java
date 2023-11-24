import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q9 {
    public static void main(String[] args) {
        String sourceFilePath = "Q6.txt"; 
        String destinationFilePath = "Q9.txt"; 
        String searchWord = "how"; 
        String replaceWord = "Where"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             FileWriter writer = new FileWriter(destinationFilePath)) 
            {
                String line;
                while ((line = reader.readLine()) != null) 
                {
                    String modifiedLine = line.replaceAll(searchWord, replaceWord);
                    writer.write(modifiedLine);
                    writer.write(System.lineSeparator());
                }
                  System.out.println("Content modified and saved successfully to " + destinationFilePath);
            } 
            catch (IOException e) 
            {
                System.out.println("An error occurred while modifying the file: " + e.getMessage());
            }
    }
}
