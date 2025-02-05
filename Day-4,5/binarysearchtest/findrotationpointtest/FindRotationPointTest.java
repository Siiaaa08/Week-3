package binarysearchtest.findrotationpointtest;

import binarysearch.findrotationpoint.FindRotationPoint;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FindRotationPointTest {
        @Test
        public void tester(){
            FindRotationPoint obj=new FindRotationPoint();
            int[] arr={8,9,0,2,3,4,5,6,7};
            int ans=obj.search(arr);

            Assert.assertEquals(ans,0);

        }


    }


