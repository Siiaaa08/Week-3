package chalengeproblem.linearandbinary;

import static chalengeproblem.linearandbinary.BinarySearch.binarySearch;
import static chalengeproblem.linearandbinary.LinearSearch.linearSearch;

public class Main {
        public static void main(String[] args) {
            int arr[]={1,2,3,4,6,7,8,9};
            linearSearch(arr);
            binarySearch(arr,4);
        }
    }


