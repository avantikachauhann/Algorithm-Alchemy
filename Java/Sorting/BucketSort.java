/*Bucket Sort is a sorting algorithm that divides an array into several "buckets," where each bucket represents a range of values. Elements from the input array are distributed into these buckets based on their values. Each bucket is sorted independently, and then the sorted buckets are concatenated to form the final sorted array. Here's a Java implementation of Bucket Sort along with an explanation and time complexity analysis:

Algorithm:

Create an array of empty buckets.
Traverse through the input array and distribute elements into buckets.
Sort each bucket, either using another sorting algorithm or recursively applying Bucket Sort.
Concatenate all the sorted buckets to obtain the final sorted array.
Java Code:*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(double[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // Create buckets
        List<List<Double>> buckets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        // Put elements into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets.get(bucketIndex).add(arr[i]);
        }

        // Sort individual buckets (using a simple sorting algorithm here)
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets.get(i));
        }

        // Concatenate sorted buckets to form the final sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets.get(i).size(); j++) {
                arr[index++] = buckets.get(i).get(j);
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51};
        System.out.println("Original Array:");
        for (double num : arr) {
            System.out.print(num + " ");
        }

        bucketSort(arr);

        System.out.println("\nSorted Array:");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*Time Complexity Analysis:

The time complexity of Bucket Sort depends on the distribution of input data and the sorting algorithm used within each bucket:

Best-case time complexity: O(n + k), where n is the number of elements in the input array, and k is the number of buckets.
Average-case time complexity: O(n^2/k + k), where k is the number of buckets, and n is the number of elements. The choice of k and the distribution of input data affect the performance.
Worst-case time complexity: O(n^2), which occurs when all elements are placed in a single bucket, and that bucket is sorted using an inefficient sorting algorithm.
Bucket Sort is efficient when the input data is uniformly distributed, and the number of buckets is chosen appropriately. It can be used as a general-purpose sorting algorithm when the conditions are favorable.*/
