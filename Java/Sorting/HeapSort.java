/*
Explanation of the approach:
1. The heap sort algorithm uses a binary heap data structure to sort the elements.
2. First, we build a max heap from the input array.
3. To build the max heap, we start from the parent of the last element and heapify all the elements up to the root of the heap.
4. The heapify operation ensures that the largest element is at the root of the heap.
5. Once the max heap is built, we extract elements one by one from the heap and move them to the end of the array.
6. After each extraction, we heapify the remaining heap to maintain the max heap property.
7. Finally, the array is sorted in ascending order.

Time Complexity: 
- Building the max heap takes O(n) time.
- Extraction of each element and heapify operation takes O(log n) time.
- Therefore, the overall time complexity of heap sort is O(n log n).

Space Complexity:
- The space complexity of heap sort is O(1) since it does not require any additional space.

Sample Input:
Input: [12, 11, 13, 5, 6, 7]

Sample Output:
Output: [5, 6, 7, 11, 12, 13]
*/

import java.util.Arrays;

public class HeapSort {
    
    public static void heapSort(int[] array) {
        int n = array.length;
        
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        
        // Extract elements from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            
            // Max heapify the reduced heap
            heapify(array, i, 0);
        }
    }
    
    public static void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        
        // If right child is larger than root
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }
        
        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            
            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Input: " + Arrays.toString(array));
        
        heapSort(array);
        
        System.out.println("Output: " + Arrays.toString(array));
    }
}


