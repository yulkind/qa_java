package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ParamLionTest {

    private final String sex;
    private final boolean expectedResult;

    public ParamLionTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object [][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testLionShouldHaveManeOrNot() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedResult, actual);
    }
}