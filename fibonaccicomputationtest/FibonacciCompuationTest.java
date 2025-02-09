package fibonaccicomputationtest;

import org.junit.jupiter.api.Test;

import static fibonaccicomputation.FibonacciComputation.fibonaccicompare;
import static org.junit.Assert.assertEquals;

public class FibonacciCompuationTest {
        @Test
        public void test(){
            int [] sizes = {10, 30};
            for (int size : sizes){
                double [] ans = fibonaccicompare(size);
               assertEquals(ans[0] > ans[1], true);
            }
        }
    }


