package binarysearch.findpeakelement;

import java.util.ArrayList;

public class FindPeakElement {
    public static ArrayList<Integer> search(int[] arr) {
            ArrayList<Integer> result = new ArrayList<>();
            findPeaks(arr, 0, arr.length - 1, result);
            return result;
        }

        private static void findPeaks(int[] arr, int start, int end, ArrayList<Integer> result) {
            // if start > end, return (no elements to process)
            if (start > end) return;

            int mid = start + (end - start) / 2;

            // Check if the mid element is a peak
            boolean leftSmaller = (mid == 0) || (arr[mid] >= arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] >= arr[mid + 1]);

            if (leftSmaller && rightSmaller) {
                result.add(arr[mid]);
            }

            findPeaks(arr, start, mid - 1, result);  // Left half
            findPeaks(arr, mid + 1, end, result);    // Right half
        }


    }


