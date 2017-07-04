package com.thoughtworks;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class FizzBuzzTransformTest {

    private FizzBuzzTransformer transformer;

    @Before
    public void setUp() throws Exception {
        transformer = new FizzBuzzTransformer();
    }

    @Test
    public void shouldReturn2WhenSendNumber2() {
        assertEquals(transformer.numberConvert(2), "2");
    }

    @Test
    public void shouldReturnFizzWhenDivisibleBy3(){
        assertEquals(transformer.numberConvert(9), "Fizz");
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleBy5() throws Exception {
        assertEquals(transformer.numberConvert(10), "Buzz");

    }

    @Test
    public void shoudReturnFizzBuzzWhenDivisibleBy3And5() throws Exception {
        assertEquals(transformer.numberConvert(15), "FizzBuzz");

    }

    @Test
    public void shouldTrueWhenNumberIsDivisible(){
        assertTrue(transformer.isDivisible(9,3));
    }

    @Test
    public void shoudFalseWhenNumberIsNotDivisible(){
        assertFalse(transformer.isDivisible(3,2));
    }

}
