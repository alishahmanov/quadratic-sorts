package cli;

import algorithms.selection.SelectionSort;
import metrics.PerformanceTracker;
import java.util.Random;

public class SelectionBenchmarkRunner {
    public static void main(String[] args) {
        try {
            int[] sizes = {10, 100, 1000, 5000};
            Random random = new Random();

            for (int n : sizes) {
                int[] arr = random.ints(n, 0, 10000).toArray();
                PerformanceTracker tracker = new PerformanceTracker();

                SelectionSort.sort(arr, tracker);
                System.out.println("n=" + n + " | " + tracker);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
