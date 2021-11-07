package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void testLionActualSexHasManeTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualSex = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actualSex);
    }

    @Test
    public void testLionHasManeTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actualHasMane);
    }

    @Test
    public void testLionGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedGetKittens = 0;
        int actualGetKittens = lion.getKittens();
        assertEquals(expectedGetKittens, actualGetKittens);
    }

    @Test
    public void testLionEatMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void testLionHasManeFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actualHasMane);
    }

    @Test(expected = Exception.class)
    public void testLionSexException() throws Exception {
        Lion lion = new Lion("", feline);
        lion.doesHaveMane();
    }
}