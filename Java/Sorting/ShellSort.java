/*
Explanation:
- The `shellSort()` function implements the Shell Sort algorithm. It starts with a large gap and then reduces the gap until it reaches 1. It performs insertion sort on subarrays with a specific gap.
- In the main method, we create an array `arr` with some sample input values.
- We print the array before sorting using the `printArray()` function.
- Then, we call the `shellSort()` function to sort the array.
- Finally, we print the array after sorting using the `printArray()` function.

Time Complexity: The time complexity of Shell Sort depends on the chosen gap sequence. For the average and best cases, it has a time complexity of O(n log n), where n is the number of elements in the array. However, in the worst case, it can have a time complexity of O(n^2).

Space Complexity: Shell Sort has a space complexity of O(1) because it operates on the input array in-place, without using any additional data structures.

Sample Input:
Array before sorting:
64 34 25 12 22 11 90

Sample Output:
Array after sorting:
11 12 22 25 34 64 90
*/

//Java program for Shell Sort

public class ShellSort {
  
  // Function to perform shell sort
  public static void shellSort(int[] arr) {
    int n = arr.length;
  
    // Start with a large gap, then reduce the gap
    for (int gap = n/2; gap > 0; gap /= 2) {
      
      // Perform insertion sort within the gap
      for (int i = gap; i < n; i++) {
        int temp = arr[i];
        int j;
        
        // Shift earlier gap-sorted elements until the correct position for the current element is found
        for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
          arr[j] = arr[j - gap];
        }
        
        // Place the current element in its correct position
        arr[j] = temp;
      }
    }
  }
  
  // Function to print the array
  public static void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  
  // Main method to test the program
  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12, 22, 11, 90};
    
    System.out.println("Array before sorting:");
    printArray(arr);
    
    shellSort(arr);
    
    System.out.println("Array after sorting:");
    printArray(arr);
  }
}

