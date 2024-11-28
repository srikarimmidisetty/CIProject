package com.example.app;

public class App {
    public int add(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE) {
            throw new ArithmeticException("Overflow: Result exceeds integer limit");
        }
        return a + b;
    }
}
