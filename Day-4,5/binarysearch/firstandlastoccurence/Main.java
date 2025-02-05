package binarysearch.firstandlastoccurence;

import static binarysearch.firstandlastoccurence.FirstAndLastOccurence.*;

public class Main {
        public static void main(String[] args) {
            int[] arr={1,1,1,1,3,3,3,4,5,5,6,7,8,9};
            int target=1;
            int index=binarySearch(arr,target);
            int first=firstOccurance(arr,index);
            int last=lastOccurance(arr,index);
            System.out.println("The first occurance is "+first+" and the last occurance is "+last);
        }
    }


