/*
Approach:
The linear search algorithm works by sequentially checking each element in an array until the target element is found or the end of the array is reached. It iteratively compares each element with the target element, returning the index if a match is found, or -1 if the target element is not present in the array.

Comments:
- The `linearSearch` method takes two parameters: the array to be searched and the target element.
- In the `linearSearch` method, we use a for loop to iterate through each element in the array.
- Inside the loop, we check if the current element is equal to the target element using the condition `arr[i] == target`.
- If a match is found, we return the index `i` of the target element.
- If the loop completes without finding a match, we return -1 to indicate that the target element is not present in the array.
- In the `main` method, we define a sample array `arr` and a target element `target`.
- We then call the `linearSearch` method and store the returned index in the `index` variable.
- Based on the value of `index`, we print the appropriate output message indicating whether the element was found or not.

Time Complexity: The time complexity of Linear Search is O(n), where n is the number of elements in the array. This is because in the worst-case scenario, the algorithm needs to iterate through each element in the array to search for the target element.

Space Complexity: The space complexity of Linear Search is O(1) because it only requires a constant amount of additional space for storing the loop variable, target element, and index.

Sample Input:
Array: {10, 7, 4, 5, 2, 8, 6}
Target Element: 5

Sample Output:
Element found at index: 3
*/

public class LinearSearch {
    // Function to perform Linear Search
    public static int linearSearch(int[] arr, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to the target element
            if (arr[i] == target) {
                // Return the index of the target element
                return i;
            }
        }
        // Return -1 if the target element is not found in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 4, 5, 2, 8, 6};
        int target = 5;

        // Perform linear search
        int index = linearSearch(arr, target);

        if (index == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
