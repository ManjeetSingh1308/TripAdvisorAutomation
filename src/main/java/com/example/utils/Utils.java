package com.example.utils;

public final class Utils {
    private Utils() {}

    public static void sleepSeconds(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
