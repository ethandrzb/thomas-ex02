import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution02Test
{
    @Test
    void charCount()
    {
        Assertions.assertEquals("test has 4 characters.", Solution02.charCount("test"));

        Assertions.assertNotEquals("one has 1 characters.", Solution02.charCount("one"));

        Assertions.assertEquals("one has 3 characters.", Solution02.charCount("one"));
    }
}