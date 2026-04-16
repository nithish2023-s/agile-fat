package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testFineCalculation_NoFine() {
        int days = 5;
        int fine = calculateFine(days);
        assertEquals(0, fine);
    }

    @Test
    public void testFineCalculation_WithFine() {
        int days = 10;
        int fine = calculateFine(days);
        assertEquals(30, fine);
    }

    public int calculateFine(int days) {
        int allowed = 7;
        if (days > allowed) {
            return (days - allowed) * 10;
        }
        return 0;
    }
}
