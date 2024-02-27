package Exercice4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {

    @Test public void solveZeroTest(){
        Assertions.assertThrows(IllegalArgumentException.class , ()->QuadraticEquation.solve(0,1,2));
    }

    @Test public void solveUnsolvableTest(){
        Assertions.assertNull(QuadraticEquation.solve(1, 1, 1));
    }

    @Test public void solveOneSolutionTest(){
        double[] result = QuadraticEquation.solve(1,2,1);
        assert result != null;
        Assertions.assertEquals(-1, result[0]);
    }

    @Test public void solveTwoSolutionTest(){
        double[] result = QuadraticEquation.solve(1,-3,2);
        assert result != null;
        Assertions.assertTrue(result[0] == 1 || result[0] == 2);
        Assertions.assertTrue(result[1] == 1 || result[1] == 2);
    }
}
