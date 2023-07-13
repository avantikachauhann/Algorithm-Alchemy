/*
Approach:
∙ Start with the first index and find the index smallest element from the unsorted array
∙ Replace the value at the smallest index with the current index
∙ Move the current index one step to the right

Time Complexity: The time complexity of the implementation: O(n^2) in the worst, average and best cases.
Space Complexity: The space complexity : O(1).

Sample Input:
Array before sorting: 64 34 25 12 22 11 90

Sample Output:
Array after sorting: 11 12 22 25 34 64 90
*/

// Bubble Sort in Java
public class SelectionSort {
  
    // Function to perform selection sort
    public static void selectionSort(int[] arr) {
		// Initialize n to array length and temporary variables
      	int n = arr.length;
		int tempInd, tempVal;

		// Traverse through 0 to n - 1
      	for(int i=0; i<n-1; i++) {
			// Initialize minInd to the current index
        	int minInd = i;
			// Iterate through the unsorted array to find the min value index
        	for(int j=i+1; j<n; j++) {
				// If jth index element is less than element at minInd, make j the min_ind
            	if(arr[j] < arr[minInd]) {
                	tempInd = minInd;
                	minInd = j;
                	j = tempInd;
            	}
        	}
			// Replace the elements at i and minInd
        	tempVal = arr[i];
			arr[i] = arr[minInd];
			arr[minInd] = tempVal;
      	}
    }
    
    // Driver code
    public static void main(String[] args) {
      int[] arr = {64, 34, 25, 12, 22, 11, 90};
      
      System.out.println("Array before sorting:");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      
      selectionSort(arr);
      
      System.out.println("\n\nArray after sorting:");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }
  
  