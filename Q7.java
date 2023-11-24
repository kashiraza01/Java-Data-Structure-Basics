import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q7 {
    private static int countWords(String line) 
    {
        if (line == null || line.isEmpty()) 
        {
            return 0;
        }

        String[] words = line.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String inputFilePath = "Q6.txt"; 
        String outputFilePath = "Q7_out.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        FileWriter writer = new FileWriter(outputFilePath)) 
        {
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
                wordCount += countWords(line);
            }
            System.out.println("Total words in the file: " + wordCount);
            writer.write("Total words in the file: " + wordCount);
        } 
        catch 
        (IOException e) 
        {
            System.out.println("An error occurred while reading/writing the file: " + e.getMessage());
        }
    }
}