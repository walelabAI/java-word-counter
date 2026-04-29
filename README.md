# java-word-counter
Java program that reads a text file and counts the number of words
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        int count = 0;

        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }

            scanner.close();
            System.out.println("Total words: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
