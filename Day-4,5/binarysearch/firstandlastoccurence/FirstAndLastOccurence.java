package binarysearch.firstandlastoccurence;

public class FirstAndLastOccurence {
        public static int binarySearch(int[] arr, int target) {
            int start = 0;
            int ans = -1;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    ans = mid;
                    break;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return ans;
        }

        public static int firstOccurance(int[] arr, int index) {
            int start = 0;
            int end = index;
            int ans = index;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == arr[index]) {
                    ans = mid;       // Potential first occurrence found
                    end = mid - 1;   // Keep searching to the left
                } else {
                    start = mid + 1;
                }
            }
            return ans;
        }

        public static int lastOccurance(int[] arr, int index) {
            int start = index;
            int end = arr.length - 1;
            int ans = index;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == arr[index]) {
                    ans = mid;       // Potential last occurrence found
                    start = mid + 1; // Keep searching to the right
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }
    }


