package com.company;

import org.junit.Assert;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println(getAverage(5, 10));
    }

    public static float getAverage(int a, int b) {
        checkParams(a, b);
        return (float) (a + b) / 2;
    }

    private static void checkParams(int a, int b) {
        if (a < 0 || b < 0 || a > b) {
            throw new IllegalArgumentException("Аргументы функции неверные!");
        }
    }

    @Test
    public void getAverageTest() {
        Assert.assertEquals(5.5, getAverage(1, 10), 0);
        Assert.assertEquals(0, getAverage(0, 0), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeNumbersTest() {
        getAverage(-10, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongNumbersTest() {
        getAverage(10, 1);
    }
}