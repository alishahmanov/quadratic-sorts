package algorithms.selection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    void basicSorting() {
        int[] a = {5, 2, 4, 6, 1, 3};
        SelectionSort.sort(a);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, a);
    }

    @Test
    void alreadySorted() {
        int[] a = {1,2,3,4,5};
        SelectionSort.sort(a);
        assertArrayEquals(new int[]{1,2,3,4,5}, a);
    }

    @Test
    void emptyArray() {
        int[] a = {};
        SelectionSort.sort(a);
        assertArrayEquals(new int[]{}, a);
    }

    @Test
    void reverseSorted() {
        int[] a = {9,7,5,3,1};
        SelectionSort.sort(a);
        assertArrayEquals(new int[]{1,3,5,7,9}, a);
    }
}
