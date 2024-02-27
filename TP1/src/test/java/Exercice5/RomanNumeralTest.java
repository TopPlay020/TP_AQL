package Exercice5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test public void toRomanErrorTest(){
        Assertions.assertThrows(IllegalArgumentException.class , ()->RomanNumeral.toRoman(-1));
        Assertions.assertThrows(IllegalArgumentException.class , ()->RomanNumeral.toRoman(4000));
    }

    @Test public void toRomanAssertTest(){
        Assertions.assertEquals("I" , RomanNumeral.toRoman(1));

        Assertions.assertEquals("IV" , RomanNumeral.toRoman(4));
        Assertions.assertEquals("IX" , RomanNumeral.toRoman(9));
        Assertions.assertEquals("XL" , RomanNumeral.toRoman(40));
        Assertions.assertEquals("XC" , RomanNumeral.toRoman(90));
        Assertions.assertEquals("CD" , RomanNumeral.toRoman(400));
        Assertions.assertEquals("CM" , RomanNumeral.toRoman(900));
    }
}
