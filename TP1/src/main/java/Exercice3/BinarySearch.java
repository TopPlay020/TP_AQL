package Exercice3;

public class BinarySearch {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }

        for(int i=0 ; i<array.length-1 ; i++)
            if (array[i] >= array[i+1])
                throw new IllegalArgumentException("Array not in order !!");

        int low = 0;
        int high = array.length - 1;
        // <= and not <
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] <= element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
