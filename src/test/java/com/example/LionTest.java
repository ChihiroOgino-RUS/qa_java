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
public class LionTest {

    Lion lion;

    @Mock
    Feline feline;

    @Before
    public void init() throws Exception {
        lion = new Lion("Самец", feline);
    }


    @Test(expected = Exception.class)
    public void lionConstructorExceptionTest() throws Exception {
        new Lion("Другой", feline);
    }

    @Test
    public void getKittensTest() {
        when(feline.getKittens()).thenReturn(1);
        int actualCount = lion.getKittens();
        int expectedCount = 1;

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);

        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }
}
