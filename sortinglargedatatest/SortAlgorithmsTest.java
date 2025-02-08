package sortinglargedatatest;

import org.junit.jupiter.api.Test;
import sortinglargedata.SortAlgorithms;

import static org.junit.Assert.assertEquals;

public class SortAlgorithmsTest {
    @Test
    void test(){
        int[] arr = {1000,10000};
        for(int a : arr) {
            double[] result = SortAlgorithms.compare(a);

            assertEquals(result[1] < result[0] && result[1] < result[2], true);
        }
    }


}
