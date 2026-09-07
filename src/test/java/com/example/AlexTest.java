package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    Alex alex;

    @Mock
    Feline feline;

    @Before
    public void init() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void getKittensTest() {
        when(feline.getKittens()).thenReturn(1);
        int actualCount = alex.getKittens();
        int expectedCount = 0;

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getFriendsTest() {
        List<String> expectedList = List.of("Марти", "Глория", "Мелман");
        List<String> actualList = alex.getFriends();

        assertEquals(expectedList, actualList);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String expectedPlace = "Нью-Йоркский зоопарк";
        String actualPlace = alex.getPlaceOfLiving();

        assertEquals(expectedPlace, actualPlace);
    }
}
