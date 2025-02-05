package binarysearch.searchtargetvalue;

import java.util.Arrays;

import static binarysearch.searchtargetvalue.SearchTargetValue.search;

public class Main {
        public static void main(String[] args) {
            int[][] arr = {
                    {10, 20, 30, 40},
                    {50, 55, 65, 67},
                    {70, 72, 73, 89},
                    {90, 93, 97, 99}
            };

            int target = 72;
            int[] result = search(arr, target);
            System.out.println(Arrays.toString(result));
        }
    }


