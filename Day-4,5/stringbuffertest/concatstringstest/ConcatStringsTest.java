package stringbuffertest.concatstringstest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import stringbuffer.concatstings.ConcatStrings;

class ConcatStringsTest {

    @Test
    void testConcatsString() {
        String[] input = {"Heyy", " ", "Siaa", "!"};
        String expected = "Heyy Siaa!";

        String result = ConcatStrings.concatsString(input);

        assertEquals(expected, result);
    }

}


