package com.thoughtworks;

public class Main {

    public static void main(String[] args) {
        // write your code here

        FizzBuzzTransformer ft = new FizzBuzzTransformer();
        FizzBuzz fb = new FizzBuzz(ft);

        System.out.println(fb.returnNumbers());
    }
}
