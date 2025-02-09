package fibonaccicomputation;

import static fibonaccicomputation.FibonacciComputation.fibonaccicompare;

public class Main {
        public static void main(String[] args) {

            int [] sizes = {10, 30, 50};

            for (int i : sizes) {
                fibonaccicompare(i);
            }
        }
    }


