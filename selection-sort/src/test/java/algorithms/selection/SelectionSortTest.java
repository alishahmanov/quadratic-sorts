package algorithms.selection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SelectionSortTest {

    @Test
    void basicSorting() {
        int[] arr = {5, 2, 4, 6, 1, 3};
        SelectionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    void alreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        SelectionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void reverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void withDuplicates() {
        int[] arr = {3, 3, 1, 2, 1};
        SelectionSort.sort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, arr);
    }

    @Test
    void emptyArray() {
        int[] arr = {};
        SelectionSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void singleElement() {
        int[] arr = {7};
        SelectionSort.sort(arr);
        assertArrayEquals(new int[]{7}, arr);
    }
}
