package mephi.algorithms;

// CustomCollections.java
import java.util.Comparator;
import java.util.List;

public class CustomCollections {

    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return binarySearch(list, key, Comparator.naturalOrder());
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> comparator) {
        if (list == null || comparator == null) {
            throw new NullPointerException("List and Comparator must not be null");
        }

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midValue = list.get(mid);
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

    public static <T> int binarySearchIgnoreCase(List<String> list, String key) {
        if (list == null || key == null) {
            throw new NullPointerException("List and key must not be null");
        }
        return binarySearch(list, key, String::compareToIgnoreCase);
    }

    public static <T> int binarySearchWithCustomLogic(List<? extends T> list, T key, Comparator<? super T> comparator) {
        if (list.isEmpty()) {
            return -1;
        }
        return binarySearch(list, key, comparator);
    }
}
