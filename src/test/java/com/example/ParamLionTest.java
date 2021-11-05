package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ParamLionTest{

    private final String sex;

    public ParamLionTest(String sex, boolean expected) {
        this.sex = sex;
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object [][] {
                {"Самец", true},
                {"Самец", false}
        };
    }

    @Test
    public void testLionShouldHaveManeOrNot() {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(false, actual);
    }
}