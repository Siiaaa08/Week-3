package circulartourproblem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public int result(int[][] arr){
        Queue<Integer> queue = new LinkedList<>();
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startIndex = 0;

        for (int i=0;i<arr.length;i++){
            int petrol = arr[i][0];
            int distance = arr[i][1];
            int balance = petrol - distance;

            totalSurplus += balance;
            currentSurplus += balance;

            if (currentSurplus < 0) {
                while (!queue.isEmpty()) {
                    queue.poll();
                }
                startIndex = i + 1;
                currentSurplus = 0;
            }

        }
        return (totalSurplus >= 0) ? startIndex : -1;


    }

}

