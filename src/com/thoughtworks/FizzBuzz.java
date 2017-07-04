package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class FizzBuzz {

    private final FizzBuzzTransformer transformer;

    public FizzBuzz(FizzBuzzTransformer transformer) {
        this.transformer = transformer;
    }

    public String returnNumbers() {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            result += transformer.numberConvert(i);
        }
        return result;
    }

}
