package com.example;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class ParamLiontest{
    private final String sex;
    private final boolean expected;

    public ParamLiontest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object [] [] {
                {"Самец", true},
                {"Самец", false}
        };
    }
}