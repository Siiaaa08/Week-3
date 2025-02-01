package insertionsort;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            SortEmployee b=new SortEmployee();
            int[] arr={3,9,2,1,2,4};
            int[] res=b.insertion(arr);
            System.out.println(Arrays.toString(res));
        }
    }


