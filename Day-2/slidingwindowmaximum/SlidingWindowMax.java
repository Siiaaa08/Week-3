package slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[]arr, int k){
        if(arr.length==0)
            return new int[0];

        int n = arr.length;
        int[] result = new int[n-k+1];
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(!deque.isEmpty() && deque.peekFirst() < i - k + 1){
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
        }

    }

