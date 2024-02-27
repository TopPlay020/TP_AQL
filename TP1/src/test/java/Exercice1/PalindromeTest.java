package Exercice1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test public void isPalindromeNullTest(){
        Assertions.assertThrows(NullPointerException.class , ()->Palindrome.isPalindrome(null));
    }

    @Test public void isPalindromeEmptyStringTest(){
        Assertions.assertTrue(Palindrome.isPalindrome(""));
    }

    @Test public void isPalindromeOneCharTest(){
        Assertions.assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test public void isPalindromeTrueTest(){
        Assertions.assertTrue(Palindrome.isPalindrome("azerreza"));
        Assertions.assertTrue(Palindrome.isPalindrome("azertreza"));
        Assertions.assertTrue(Palindrome.isPalindrome("123321"));
    }

    @Test public void isPalindromeFalseTest(){
        Assertions.assertFalse(Palindrome.isPalindrome("akerreza"));
        Assertions.assertFalse(Palindrome.isPalindrome("azerkeza"));

    }
}
