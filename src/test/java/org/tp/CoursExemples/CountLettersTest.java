package org.tp.CoursExemples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tp.CoursExemples.CountLetters;

public class CountLettersTest {
    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
}
