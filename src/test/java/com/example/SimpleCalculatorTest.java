package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void whenSumIsValid() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.sum(1, 2);
        assertThat(result, is(3));
    }
}