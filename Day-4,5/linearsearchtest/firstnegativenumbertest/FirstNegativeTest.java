package linearsearchtest.firstnegativenumbertest;

import linearsearch.firstnegativenumber.FirstNegative;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FirstNegativeTest {
    int [] arr = {3,4,-1,9,0,-5,-6};
    @Test
    void test(){
        assertEquals(2, FirstNegative.findFirstNegative(arr));
    }
}
