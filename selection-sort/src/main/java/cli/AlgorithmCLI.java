package cli;

import algorithms.selection.SelectionSort;
import metrics.PerformanceTracker;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AlgorithmCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Quadratic Sorts Benchmark ===");
        System.out.println("Running Selection Sort only.");

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = random.ints(n, 0, 10000).toArray();
        PerformanceTracker tracker = new PerformanceTracker();

        SelectionSort.sort(arr, tracker);
        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Metrics: " + tracker);
    }
}
