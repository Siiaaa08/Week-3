package stringbuffertest.comparisiontest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringbuffer.comparision.ConcatCompare;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcatCompareTest {
    private ConcatCompare concatCompare;

    @BeforeEach
    void setUp(){
        concatCompare = new ConcatCompare();
    }

    @Test
    void testStringBufferPerformance(){
        long timeTaken = concatCompare.StringBuffer();
        assertTrue(timeTaken > 0, "StringBuffer method should take some time to execute");
    }

    @Test
    void testStringBuilderPerformance() {
        long timeTaken = concatCompare.StringBuilder();
        assertTrue(timeTaken > 0, "StringBuilder method should take some time to execute");
    }

    @Test
    void testStringBuilderFasterThanStringBuffer() {
        long bufferTime = concatCompare.StringBuffer();
        long builderTime = concatCompare.StringBuilder();
        assertTrue(builderTime <= bufferTime, "StringBuilder should be faster or equal to StringBuffer");
    }
}

