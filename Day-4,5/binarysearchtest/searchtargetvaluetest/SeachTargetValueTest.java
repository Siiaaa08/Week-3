package binarysearchtest.searchtargetvaluetest;

import binarysearch.searchtargetvalue.SearchTargetValue;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SeachTargetValueTest {
        @Test
        public void tester(){
            SearchTargetValue obj=new SearchTargetValue();

            int[][] arr = {
                    {10, 20, 30, 40},
                    {50, 55, 65, 67},
                    {70, 72, 73, 89},
                    {90, 93, 97, 99}
            };

            int target = 72;
            int[] result = obj.search(arr, target);

            Assert.assertEquals(2,result[0]);
            Assert.assertEquals(1,result[1]);

        }
    }


