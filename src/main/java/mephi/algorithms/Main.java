package mephi.algorithms;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println(CustomArrays.binarySearch(byteArray, (byte) 5));

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(CustomArrays.binarySearch(charArray, 'c'));

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(CustomArrays.binarySearch(doubleArray, 5.5));

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println(CustomArrays.binarySearch(floatArray, 5.5f));

        Integer[] intArray = {10, 20, 30, 40, 50};
        System.out.println(CustomArrays.binarySearch(intArray, 30, Comparator.naturalOrder()));

        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        System.out.println(CustomArrays.binarySearch(longArray, 5L));

        short[] shortArray = {1, 2, 3, 4, 5};
        System.out.println(CustomArrays.binarySearch(shortArray, (short) 5));

        Integer[] intArrayC = {10, 20, 30, 40, 50};
        System.out.println(CustomArrays.binarySearch(intArrayC, 30, Comparator.naturalOrder()));
        System.out.println(CustomArrays.binarySearch(intArrayC, 30, Comparator.reverseOrder()));

        List<Integer> list = List.of(10, 20, 30, 40, 50);
        int index1 = CustomCollections.binarySearch(list, 30);
        System.out.println("Index of 30: " + index1);
    }
}
