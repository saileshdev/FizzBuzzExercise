package com.thoughtworks;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    FizzBuzzMock fizzBuzzMock;

    private class FizzBuzzMock extends FizzBuzzTransformer{
        private int count = 0;

        public int getCount() {
            return count;
        }

        @Override
        public String numberConvert(int number) {
            count++;
            return "A";
        }
    }



    @Before
    public void setUp() throws Exception {
        fizzBuzzMock = new FizzBuzzMock();
        fizzBuzz = new FizzBuzz(fizzBuzzMock);
    }

    @Test
    public void shoudReturnResults() {
        fizzBuzz.returnNumbers();
        assertEquals(fizzBuzzMock.getCount(), 100);
    }
}
