package org.example.homeworkten1;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class SequenceTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
    }
}