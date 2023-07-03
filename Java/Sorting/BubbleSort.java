/*
Approach:
- Bubble sort is a simple comparison-based sorting algorithm where adjacent elements are compared and swapped if they are in the wrong order. This process is repeated until the entire array is sorted.
- The outer loop runs n-1 times, where n is the length of the array. The inner loop runs n-i-1 times in each iteration of the outer loop, where i is the current iteration.
- In each pass of the inner loop, the largest element "bubbles up" to its correct position. Hence, after the i-th pass, the last i elements of the array are already sorted and do not need to be checked again.

Time Complexity: O(n^2) - Bubble sort has an average-case and worst-case time complexity of O(n^2).
Space Complexity: O(1) - Bubble sort is an in-place sorting algorithm, i.e., it does not require any additional space.

Sample Input:
Array before sorting: 64 34 25 12 22 11 90

Sample Output:
Array after sorting: 11 12 22 25 34 64 90
*/

// Bubble Sort in Java
public class BubbleSort {
  
  // Function to perform bubble sort
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        // Swap elements if the current element is greater than the next element
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  
  // Driver code
  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12, 22, 11, 90};
    
    System.out.println("Array before sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    
    bubbleSort(arr);
    
    System.out.println("\n\nArray after sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

