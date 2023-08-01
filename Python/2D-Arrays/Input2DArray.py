'''
Explanation of Approach:
- The program takes input for the number of rows and columns of the 2D array.
- It then calls the `take_2d_array_input` function to take input for the elements of the 2D array.
- The `take_2d_array_input` function iterates through each row and takes input for the elements of that row using `input` and `split` functions.
- It then appends each row to the 2D array `array_2d`.
- Finally, the program prints the 2D array in a readable format.

Time Complexity:
- The time complexity of this program is O(rows * cols), where `rows` is the number of rows and `cols` is the number of columns. It takes input for each element of the 2D array, which requires traversing each cell.

Space Complexity:
- The space complexity of this program is O(rows * cols) because it stores the entire 2D array in memory.

Sample Input:
Enter the number of rows: 3
Enter the number of columns: 4
Enter 4 elements for row 1: 1 2 3 4
Enter 4 elements for row 2: 5 6 7 8
Enter 4 elements for row 3: 9 10 11 12

Sample Output:
2D Array:
[1, 2, 3, 4]
[5, 6, 7, 8]
[9, 10, 11, 12]

In the sample input, the user entered a 3x4 2D array, and the program printed the input array as the output.
'''

def take_2d_array_input(rows, cols):
    # Initialize an empty 2D array
    array_2d = []

    # Input the elements row by row
    for i in range(rows):
        row = list(map(int, input(f"Enter {cols} elements for row {i + 1}: ").split()))
        array_2d.append(row)

    return array_2d

def main():
    rows = int(input("Enter the number of rows: "))
    cols = int(input("Enter the number of columns: "))

    # Take input for the 2D array
    array_2d = take_2d_array_input(rows, cols)

    # Print the input 2D array
    print("2D Array:")
    for row in array_2d:
        print(row)

if __name__ == "__main__":
    main()

