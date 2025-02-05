package binarysearch.findrotationpoint;

import static binarysearch.findrotationpoint.FindRotationPoint.search;

public class Main {
        public static void main(String[] args) {
            int[] arr={8,9,0,2,3,4,5,6,7};
            int ans=search(arr);
            System.out.println("The rotation point is "+ans);


        }
    }


