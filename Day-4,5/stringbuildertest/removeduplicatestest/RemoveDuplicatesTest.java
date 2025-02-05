package stringbuildertest.removeduplicatestest;

import org.junit.jupiter.api.Test;
import stringbuilder.removeduplicates.RemoveDuplicates;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    void testing(){
        assertEquals("Sia", RemoveDuplicates.removeDuplicates("Siaa"));
    }
}
