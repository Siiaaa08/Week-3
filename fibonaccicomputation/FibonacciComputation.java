package fibonaccicomputation;

public class FibonacciComputation {

        public static int fibonacciRecursive(int n) {
            if (n <= 1) return n;
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }

        public static int fibonacciIterative(int n) {
            int a = 0, b = 1, sum;
            for (int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }

        public static double[] fibonaccicompare(int size) {
            double[] output = new double[3];
            long start = System.nanoTime();
            fibonacciRecursive(size);
            long fibonacciRecursiveTime = System.nanoTime() - start;

            start = System.nanoTime();
            fibonacciIterative(size);
            long fibonacciIterativeTime = System.nanoTime() - start;


            output[0] = fibonacciRecursiveTime / 1000000.0;
            output[1] = fibonacciIterativeTime / 1000000.0;

            System.out.println("Dataset Size: " + size);
            System.out.println("fibonacciRecursive Time: " + output[0] + " ms");
            System.out.println("fibonacciIterative Time: " + output[1] + " ms");

            System.out.println("---------------------------------");
            return output;
        }
    }




