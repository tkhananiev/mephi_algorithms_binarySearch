package mephi.algorithms;

// CustomArrays.java
import java.util.Comparator;
import java.util.*;

public class CustomArrays {

    public static int binarySearch(byte[] array, byte key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(byte[] array, int fromIndex, int toIndex, byte key) {
        validateRange(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            byte midValue = array[mid];

            if (midValue == key) {
                return mid;
            } else if (midValue < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    public static int binarySearch(char[] array, char key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(char[] array, int fromIndex, int toIndex, char key) {
        validateRange(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            char midValue = array[mid];

            if (midValue == key) {
                return mid;
            } else if (midValue < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    public static int binarySearch(double[] array, double key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(double[] array, int fromIndex, int toIndex, double key) {
        validateRange(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            double midValue = array[mid];

            if (midValue == key) {
                return mid;
            } else if (midValue < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    public static int binarySearch(float[] array, float key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(float[] array, int fromIndex, int toIndex, float key) {
        validateRange(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            float midValue = array[mid];

            if (midValue == key) {
                return mid;
            } else if (midValue < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    public static int binarySearch(long[] array, long key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(long[] array, int fromIndex, int toIndex, long key) {
        validateRange(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midValue = array[mid];

            if (midValue == key) {
                return mid;
            } else if (midValue < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    public static int binarySearch(short[] array, short key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(short[] array, int fromIndex, int toIndex, short key) {
        validateRange(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            short midValue = array[mid];

            if (midValue == key) {
                return mid;
            } else if (midValue < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    public static <T> int binarySearch(T[] array, T key, Comparator<? super T> comparator) {
        return binarySearch(array, 0, array.length, key, comparator);
    }

    public static <T> int binarySearch(T[] array, int fromIndex, int toIndex, T key, Comparator<? super T> comparator) {
        validateRange(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midValue = array[mid];
            int comparison = comparator.compare(midValue, key);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

    private static void validateRange(int arrayLength, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }
        if (fromIndex < 0 || toIndex > arrayLength) {
            throw new ArrayIndexOutOfBoundsException("Invalid range: [" + fromIndex + ", " + toIndex + ")");
        }
    }

    public static <T extends Comparable<T>> int binarySearchWithCustomLogic(T[] array, T key) {
        if (key == null) {
            throw new NullPointerException("Key must not be null");
        }
        return binarySearch(array, key, Comparator.naturalOrder());
    }
}


