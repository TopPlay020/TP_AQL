package Exercice6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test public void fizzBuzzNotPositiveTest(){
        Assertions.assertThrows(IllegalArgumentException.class , ()->FizzBuzz.fizzBuzz(-1));
    }

    @Test public void fizzBuzzFizzTest(){
        Assertions.assertEquals("Fizz" , FizzBuzz.fizzBuzz(3));
    }

    @Test public void fizzBuzzBuzzTest(){
        Assertions.assertEquals("Buzz" , FizzBuzz.fizzBuzz(5));
    }

    @Test public void fizzBuzzFizzBuzzTest(){
        Assertions.assertEquals("FizzBuzz" , FizzBuzz.fizzBuzz(15));
    }

    @Test public void fizzBuzzNoneTest(){
        Assertions.assertEquals("16" , FizzBuzz.fizzBuzz(16));
    }
}
