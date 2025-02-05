package binarysearchtest.findpeakelementtest;

import binarysearch.findpeakelement.FindPeakElement;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FindPeakElementTest {
        @Test
        public void tester(){
            FindPeakElement obj=new FindPeakElement();
            int[] arr={1,2,3,45,6,8,5,9,0};
            ArrayList result=obj.search(arr);
            ArrayList expected=new ArrayList();
            expected.addFirst(45);
            expected.add(8);
            expected.add(9);

            Assert.assertEquals(expected,result);

        }
    }


