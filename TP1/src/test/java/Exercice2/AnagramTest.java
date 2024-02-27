package Exercice2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test void isAnagramNullTest(){
        Assertions.assertThrows(NullPointerException.class , ()->Anagram.isAnagram(null,"example"));
        Assertions.assertThrows(NullPointerException.class , ()->Anagram.isAnagram("example",null));
        Assertions.assertThrows(NullPointerException.class , ()->Anagram.isAnagram(null,null));
    }

    @Test void isAnagramWithIncompatibleStrings(){
        Assertions.assertFalse(Anagram.isAnagram("aaaa" , "a"));
    }

    @Test void isAnagramTrueTest(){
        Assertions.assertTrue(Anagram.isAnagram("aaaa" , "aaaa"));
        Assertions.assertTrue(Anagram.isAnagram("zzzz" , "zzzz"));
        Assertions.assertTrue(Anagram.isAnagram("123" , "132"));
    }

    @Test void isAnagramFalseTest(){
        Assertions.assertFalse(Anagram.isAnagram("adsa" , "baaa"));
        Assertions.assertFalse(Anagram.isAnagram("a5dsa" , "ba2aa"));
    }
}
