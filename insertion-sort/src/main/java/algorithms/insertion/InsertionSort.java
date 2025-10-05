package algorithms.insertion;

import metrics.PerformanceTracker;

public class InsertionSort {
    public static void sort(int[] arr, PerformanceTracker tracker) {
        if (arr == null || arr.length <= 1) return;

        tracker.startTimer();

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            tracker.incArrayAccesses(1);

            tracker.incComparisons();
            if (arr[j] <= key) {
                continue;
            }

            while (j >= 0 && arr[j] > key) {
                tracker.incComparisons();
                tracker.incArrayAccesses(2);
                arr[j + 1] = arr[j];
                tracker.incSwaps();
                j--;
            }

            tracker.incArrayAccesses(1);
            arr[j + 1] = key;
        }

        tracker.stopTimer();
    }
}
