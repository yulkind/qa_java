package com.example;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeat = feline.eatMeat();
        assertEquals(expectedMeat, actualMeat);
    }

    @Test
    public void testFelineGetFamily() {
        Feline feline = new Feline();
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void testFelineGetKittens() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(), 1);
    }
}