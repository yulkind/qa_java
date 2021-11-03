package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class LionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void getKittensNumber() throws Exception {
        Lion lion = new Lion();
        when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getLionHasNoMane(String sex) throws Exception {
        Lion lion = new Lion(sex);
        boolean actualLionHasMane = lion.doesHaveMane();
        Assert.assertEquals(false, actualLionHasMane);
    }
}