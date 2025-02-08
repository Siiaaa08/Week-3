package searchtargettest;

import org.junit.jupiter.api.Test;
import searchtarget.SearchAlgorithms;

import static org.junit.Assert.assertEquals;

public class SearchAlgorithmsTest {
    @Test
    void linearTest(){
        int[] arr = {1000,10000,100000};
        int target = 100000;
        assertEquals(2, SearchAlgorithms.linearSearch(arr,target));
    }

    @Test
    void binaryTest(){
        int[] arr = {1000,10000,100000};
        int target = 100000;
        assertEquals(2,SearchAlgorithms.binarySearch(arr,target));
    }
}
