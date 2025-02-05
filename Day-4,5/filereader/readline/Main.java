package filereader.readline;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            String filePath = "D:/Sample/Day4W3/Searching/src/main/java/filereader/readline/Sample.txt";

            try {
                List<String> lines = ReadLine.readLines(filePath);

                for (String line : lines) {
                    System.out.println(line);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }


