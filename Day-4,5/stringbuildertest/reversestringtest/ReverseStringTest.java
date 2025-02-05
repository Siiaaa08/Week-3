package stringbuildertest.reversestringtest;
import  org.junit.Assert;
import org.junit.jupiter.api.Test;
import stringbuilder.reversestring.ReverseString;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

        @Test
        void teatReverse () {
            assertEquals("olleh", ReverseString.reverse("hello"));
        }


    }

