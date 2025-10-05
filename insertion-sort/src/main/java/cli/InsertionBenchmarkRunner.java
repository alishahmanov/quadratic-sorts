package cli;

import algorithms.insertion.InsertionSort;
import metrics.PerformanceTracker;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class InsertionBenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 5000, 10000, 20000};
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter("insertion_results.csv"))) {
            writer.println("n,comparisons,swaps,arrayAccesses,time(ms)");

            for (int n : sizes) {
                int[] arr = random.ints(n, 0, 10000).toArray();
                PerformanceTracker tracker = new PerformanceTracker();

                InsertionSort.sort(arr, tracker);

                writer.printf("%d,%d,%d,%d,%.3f%n",
                        n,
                        tracker.getComparisons(),
                        tracker.getSwaps(),
                        tracker.getArrayAccesses(),
                        tracker.getElapsedTimeMillis()
                );
            }
            System.out.println("Benchmark results saved to insertion_results.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
