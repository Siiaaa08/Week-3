package binarysearch.findpeakelement;

import java.util.ArrayList;

import static binarysearch.findpeakelement.FindPeakElement.search;

public class Main {
        public static void main(String[] args) {
            int[] arr={1,2,3,45,6,8,5,9,0};
            ArrayList result=search(arr);
            System.out.println(result.toString());
        }
    }


