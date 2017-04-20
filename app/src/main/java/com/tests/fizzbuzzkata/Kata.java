package com.tests.fizzbuzzkata;


public class Kata {

    public String fizzBuzz(int num) {
        boolean isMod3 = num % 3 == 0;
        boolean isMod5 = num % 5 == 0;

        if (isMod3 && isMod5) {
            return "FizzBuzz";
        } else if (isMod3) {
            return "Fizz";
        } else if (isMod5) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }

    }

}
