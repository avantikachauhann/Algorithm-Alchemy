/*
Approach:
- Bucket Sort is a sorting algorithm that works by dividing the input into a number of buckets.
- Each bucket is then sorted individually, either using a different sorting algorithm or by recursively applying the Bucket Sort algorithm.
- The sorted elements from each bucket are concatenated to produce the final sorted array.

Time Complexity: O(n^2) - In the worst case when all elements fall into a single bucket.
                O(n + n^2/k + k) = O(n^2) where n is the number of elements and k is the number of buckets.
                If the buckets are chosen well, the time complexity can be improved.

Space Complexity: O(n) - Extra space is required to store the elements in the buckets.

Sample Input:
[0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51]

Sample Output:
[0.32, 0.33, 0.37, 0.42, 0.47, 0.51, 0.52]
*/

import java.util.*;

public class BucketSort {
    public static void bucketSort(double[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        @SuppressWarnings("unchecked")
        List<Double>[] buckets = new ArrayList[n];

        // Create and initialize buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Place elements in buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort individual buckets using any sorting algorithm (e.g., insertion sort)
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate sorted buckets to get the final sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (double value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51};
        bucketSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
