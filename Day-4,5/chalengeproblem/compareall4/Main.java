package chalengeproblem.compareall4;

import java.io.FileNotFoundException;

import static chalengeproblem.compareall4.Compare.comparing;
import static chalengeproblem.compareall4.FileReadAndCount.*;

public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            String[] str={"Deepak","Singh"};
            comparing(str);
            String filepath = "D:/Sample/Day4W3/Searching/src/main/java/chalengeproblem/compareall4/Sample.txt";
            fileWordCountByFileReader(filepath);

            fileWordCountByInputStream(filepath);
            display();


        }
    }


