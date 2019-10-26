package ms3.coding.challenge;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class MS3CodingChallenge {

    public static void main(String[] args) throws IOException
    {
        
        Scanner scanner = new Scanner(new File("C:/Users/Henry Thomas/Desktop/Coding Challenge/ms3Interview.csv"));
        scanner.useDelimiter(",");
        String updateLine = "";
        while(scanner.hasNext()) {
            updateLine += scanner.next()  + "|";
        }
        System.out.println(updateLine);
        File file = new File("C:/Users/Henry Thomas/Desktop/Coding Challenge/ms3Interview.db");
        FileUtils.writeStringToFile(file, updateLine);
        scanner.close();
    }
}