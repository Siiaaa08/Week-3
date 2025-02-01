package mergesort;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            BookPrices merge=new BookPrices();
            int[] book ={23,45,56,6,78,9};
            int[] result=merge.mergesort(book);
            System.out.println(Arrays.toString(result));

        }
    }


