package algorithms.selection;
import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;


public class SelectionSortTest {
    @Test
    void testWithMetrics() {
        int[] arr = {5, 3, 1, 4, 2};
        PerformanceTracker tracker = new PerformanceTracker();

        SelectionSort.sort(arr, tracker);
        System.out.println(tracker);
    }
}
