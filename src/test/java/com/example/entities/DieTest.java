package com.example.entities;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class DieTest {

    @Test
    public void testRollWithinRange() {
        for (int i = 0; i < 1000; i++) {
            int result = Die.roll();
            assertTrue(result >= 1 && result <= 6, "Die roll out of range: " + result);
        }
    }
}
