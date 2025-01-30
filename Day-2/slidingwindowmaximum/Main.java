package slidingwindowmaximum;

public class Main {
        public static void main(String[] args) {
            SlidingWindowMax windowMax = new SlidingWindowMax();

            int[] arr = {7,-3,7,9,2,-4,1};
            int k = 3;
            int[] result = windowMax.maxSlidingWindow(arr, k);

            System.out.print("Sliding Window Maximum: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

