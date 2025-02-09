package stringconcatenationtest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import stringconcatenation.StringConcatenation;

import static org.junit.Assert.assertEquals;

public class StringConcatenationTest {
        @Test
        public void test(){
            int [] sizes = {1000, 10000};
            for (int size : sizes){
                double [] ans = StringConcatenation.compareString(size);
                assertEquals(ans[1] < ans[0] && ans[1] < ans[2], true);
            }
        }
    }


