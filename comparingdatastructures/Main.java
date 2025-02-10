package comparingdatastructures;

import static comparingdatastructures.ComparingDataStructures.comparePerformance;

public class Main {
        public static void main(String[] args) {
            int [] sizes = {1000, 100000, 1000000};

            for (int i : sizes){
                comparePerformance(i);
            }
        }
    }


