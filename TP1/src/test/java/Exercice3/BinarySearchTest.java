package Exercice3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test public void binarySearchNullTest(){
        Assertions.assertThrows(NullPointerException.class , ()->BinarySearch.binarySearch(null,0));
    }

    @Test public void binarySearchUnOrderArrayTest(){
        int[] array = new int[]{2,1,3,4,5,6,7,8,9,10};
        Assertions.assertThrows(IllegalArgumentException.class , ()->BinarySearch.binarySearch(array,0));
    }

    @Test public void binarySearchUnFoundTest(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        Assertions.assertEquals(-1 , BinarySearch.binarySearch(array,11));
    }

    @Test public void binarySearchFoundTest(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        Assertions.assertEquals(0 , BinarySearch.binarySearch(array,1));
    }
}
