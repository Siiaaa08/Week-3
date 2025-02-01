package selectionsort;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            ExamScores s=new ExamScores();
            int[] arr={3,4,2,1,6,8};
            int[] res=s.sorting(arr);
            System.out.println(Arrays.toString(res));

        }
    }


