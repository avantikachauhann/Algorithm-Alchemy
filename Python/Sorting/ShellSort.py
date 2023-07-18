'''
Explanation:
- The `shellSort()` function implements the Shell Sort algorithm. It starts with a large gap and then reduces the gap until it reaches 1. It performs insertion sort on subarrays with a specific gap.
- In the main method, we create a list `arr` with some sample input values.
- We print the list before sorting using the `printArray()` function.
- Then, we call the `shellSort()` function to sort the list.
- Finally, we print the list after sorting using the `printArray()` function.

Time Complexity: The time complexity of Shell Sort depends on the chosen gap sequence. For the average and best cases, it has a time complexity of O(n log n), where n is the number of elements in the list. However, in the worst case, it can have a time complexity of O(n^2).

Space Complexity: Shell Sort has a space complexity of O(1) because it operates on the input list in-place, without using any additional data structures.

Sample Input:
```
Array before sorting:
64 34 25 12 22 11 90
```

Sample Output:
```
Array after sorting:
11 12 22 25 34 64 90
```

The program sorts the given list using Shell Sort and prints the sorted list.
'''

def shellSort(arr):
    n = len(arr)
    gap = n // 2
    
    while gap > 0:
        for i in range(gap, n):
            temp = arr[i]
            j = i
            
            while j >= gap and arr[j - gap] > temp:
                arr[j] = arr[j - gap]
                j -= gap
            
            arr[j] = temp
        
        gap //= 2

# Function to print the array
def printArray(arr):
    for element in arr:
        print(element, end=" ")
    print()

# Main method to test the program
if __name__ == "__main__":
    arr = [64, 34, 25, 12, 22, 11, 90]

    print("Array before sorting:")
    printArray(arr)

    shellSort(arr)

    print("Array after sorting:")
    printArray(arr)


