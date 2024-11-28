package com.example.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppIntegrationTest {
    @Test
    public void testIntegrationScenario() {
        App app = new App();
        int result = app.add(10, 20);
        assertEquals(30, result);
    }
}
