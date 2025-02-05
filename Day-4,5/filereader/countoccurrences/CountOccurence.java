package filereader.countoccurrences;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountOccurence {
        public static int countWordOccurrences(String filePath, String targetWord) throws IOException {
            int count = 0;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (word.equals(targetWord)) {
                            count++;
                        }
                    }
                }
            }

            return count;
        }
    }


