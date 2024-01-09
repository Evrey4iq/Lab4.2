package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DecoderTest {

    @Test
    public void testDecodeVowels() {
        assertEquals("hello", Decoder.decode("h2ll4"));
    }

    @Test
    public void testDecodeConsonants() {
        assertEquals("testing", Decoder.decode("t2st3ng"));
    }
}
