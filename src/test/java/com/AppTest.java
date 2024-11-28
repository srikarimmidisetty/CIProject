package com.example.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AppTest {
    @Test
    public void testAddPositiveNumbers() {
        App app = new App();
        assertEquals(10, app.add(5, 5));
    }

    @Test
    public void testAddNegativeNumbers() {
        App app = new App();
        assertEquals(-10, app.add(-5, -5));
    }

    @Test
    public void testAddWithZero() {
        App app = new App();
        assertEquals(5, app.add(5, 0));
    }

    @Test
    public void testAddWithLargeNumbers() {
        App app = new App();
        assertEquals(2000000000, app.add(1000000000, 1000000000));
    }

    @Test
    public void testAddThrowsExceptionForOverflow() {
        App app = new App();
        assertThrows(ArithmeticException.class, () -> app.add(Integer.MAX_VALUE, 1));
    }
}

