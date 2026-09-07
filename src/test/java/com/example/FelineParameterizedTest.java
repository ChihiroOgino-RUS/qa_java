package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int kittensCount;

    public FelineParameterizedTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {0},
                {1},
                {5},
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actualCount = feline.getKittens(kittensCount);
        int expectedCount = kittensCount;

        assertEquals(expectedCount, actualCount);
    }
}
