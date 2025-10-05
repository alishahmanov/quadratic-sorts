package algorithms.selection;

import metrics.PerformanceTracker;

public class SelectionSort {
    public static void sort(int[] arr, PerformanceTracker tracker) {
        int n = arr.length;
        tracker.startTimer();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                tracker.incComparisons();
                tracker.incArrayAccesses(2);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                tracker.incSwaps();
                tracker.incArrayAccesses(4);
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        tracker.stopTimer();
    }
}
