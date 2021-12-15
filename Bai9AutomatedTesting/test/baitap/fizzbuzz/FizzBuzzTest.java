package baitap.fizzbuzz;

import baitap.triangleclassifier.TriangleClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

class FizzBuzzTest {

    @Test
    @DisplayName("division 3")
    void translateFizzBuzz1(){
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("division 5")
    void translateFizzBuzz2(){
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("division 3 and 5")
    void translateFizzBuzz3(){
        int number = 15;
        String expected = "mộtBuzz";

        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" don't division 3 and 5")
    void translateFizzBuzz4(){
        int number = 8;
        String expected = "tám";

        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" don't division 3 and 5")
    void translateFizzBuzz5(){
        int number = 26;
        String expected = "haisáu";

        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }
}