/* 
Quick Sort is a widely used sorting algorithm that follows the divide and conquer paradigm. It's an efficient, in-place method offering superior performance in real-world sorting applications. 

The worst-case time complexity is O(n^2), however, on average, it performs impressively with a time complexity of O(n log n).

The algorithm operates by choosing a 'pivot' from the array and partitioning the remaining elements into two sub-arrays, according to whether they are less than or greater than the pivot. 
The pivot selection and partitioning steps occur in-place, meaning they require minimal additional space.
After partitioning, the algorithm recursively applies the same logic to the sub-arrays. Over several iterations, this results in a fully sorted array.

Algorithm:
1. The quickSort function initially selects a pivot element from the array.
2. Using the partition function, it organizes the array such that elements lesser than the pivot come before it and those greater come after it.
3. The quickSort function is then recursively applied to the sub-arrays formed by the partitioning step.

Time Complexity: On average, Quick Sort operates in O(n log n), where 'n' is the number of elements. In the worst-case scenario, its performance degrades to O(n^2).

Space Complexity: The space complexity of Quick Sort is O(log n), due to the recursive nature of the algorithm storing function calls on the call stack.
*/

// Implementation of Quick Sort in Java:

public class QuickSort {
    int partition(int arr[], int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = arr[high]; 
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = {8, 7, 2, 1, 0, 9, 6};
        int n = arr.length;
     
        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, n - 1);
     
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

/* 
Sample Input:
arr[] = {8, 7, 2, 1, 0, 9, 6}

Sample Output:
Sorted array: [0, 1, 2, 6, 7, 8, 9]

Note: The Quick Sort algorithm operates by manipulating the input array in-place. However, its performance may not be optimal for arrays that are already sorted or nearly sorted.
*/
