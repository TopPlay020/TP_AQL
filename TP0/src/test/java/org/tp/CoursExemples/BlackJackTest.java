package org.tp.CoursExemples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tp.CoursExemples.BlackJack;

public class BlackJackTest {
    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }
}
