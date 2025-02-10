package comparingdatastructurestest;

import static comparingdatastructures.ComparingDataStructures.comparePerformance;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class ComparingDataStructuresTest {
        @Test
        public void test(){
            int [] sizes = {1000, 100000, 1000000};
            for (int size : sizes){
                double [] ans  = comparePerformance(size);
                assertEquals(ans[1] < ans[0] || ans[1] < ans[2], true);
            }
        }
    }



