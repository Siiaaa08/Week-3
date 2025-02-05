package binarysearch.searchtargetvalue;

public class SearchTargetValue {
        public static int[] search(int[][] arr, int target) {
            int[] res = new int[]{-1,-1};
            int rows = arr.length;
            int cols = arr[0].length;

            int start = 0;
            int end = (rows * cols) - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                int i = mid / cols;
                int j = mid % cols;

                if (arr[i][j] == target) {
                    return new int[]{i,j};

                } else if (arr[i][j] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return res;
        }

    }


