package cli;

import algorithms.insertion.InsertionSort;
import metrics.PerformanceTracker;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AlgorithmCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Quadratic Sorts Benchmark");
        System.out.println("Running Insertion Sort with optimization");

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = random.ints(n, 0, 10000).toArray();
        PerformanceTracker tracker = new PerformanceTracker();

        InsertionSort.sort(arr, tracker);

        if (n <= 50) {
            System.out.println("Sorted: " + Arrays.toString(arr));
        } else {
            System.out.println("Sorted array too large to display.");
        }

        System.out.println("Metrics: " + tracker);
    }
}
