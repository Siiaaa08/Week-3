package filereader.countoccurrences;

import java.io.IOException;

public class Main {
        public static void main(String[] args) {
            String filePath = "D:/Sample/Day4W3/Searching/src/main/java/filereader/countoccurrences/Text.txt";
            String targetWord = "SaloniBaruaa";

            try {
                int count = CountOccurence.countWordOccurrences(filePath, targetWord);
                System.out.println("The word \n" + targetWord + " appears \n" + count + " times.");
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }


