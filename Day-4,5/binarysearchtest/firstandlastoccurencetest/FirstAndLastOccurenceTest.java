package binarysearchtest.firstandlastoccurencetest;

import binarysearch.firstandlastoccurence.FirstAndLastOccurence;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FirstAndLastOccurenceTest {

        @Test
        public void tester(){
            FirstAndLastOccurence firstlast=new FirstAndLastOccurence();
            int[] arr={1,1,1,1,3,3,3,4,5,5,6,7,8,9};
            int target=1;
            int index=firstlast.binarySearch(arr,target);
            int first=firstlast.firstOccurance(arr,index);
            int last=firstlast.lastOccurance(arr,index);

            Assert.assertEquals(0,first);
            Assert.assertEquals(3,last);

        }


    }


