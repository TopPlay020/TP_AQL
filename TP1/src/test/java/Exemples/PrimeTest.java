package Exemples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {

    @Test
    public void isPrimeTest(){
        Assertions.assertFalse(Prime.isPrime(0));

        Assertions.assertTrue(Prime.isPrime(97));
        Assertions.assertFalse(Prime.isPrime(98));
    }
}
