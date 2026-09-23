package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";

        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensTest() {
        int actualCount = feline.getKittens();
        int expectedCount = 1;

        assertEquals(expectedCount, actualCount);
    }
}
