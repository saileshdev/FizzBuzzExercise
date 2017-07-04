package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class FizzBuzzTransformer {

    public String numberConvert(int number) {

        String result = "";

        if (isDivisible(number, 3)) {
            result += "Fizz";
        }

        if (isDivisible(number, 5)) {
            result += "Buzz";
        }

        if (result.equals("")) {
            return String.valueOf(number);
        }

        return result;
    }

    public boolean isDivisible(int number, int divisible){
        return ((number % divisible) == 0);
    }

}
