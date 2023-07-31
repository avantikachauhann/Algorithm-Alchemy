/*
Explanation of Approach:
- This program first takes an integer input `n`, which represents the number of elements the user wants to sum.
- It then enters a loop that runs `n` times, where in each iteration, it takes an integer input `num` from the user and adds it to the variable `sum`.
- After the loop finishes, the program outputs the calculated sum using `std::cout`.

Time Complexity:
- The time complexity of this program is O(n), where `n` is the number of elements to sum. The loop runs `n` times, and each iteration takes a constant amount of time.

Space Complexity:
- The space complexity of this program is O(1) because it uses only a constant amount of additional memory to store the variables `n`, `sum`, and `num`.

Sample Input:
Enter the number of elements: 5
Enter element 1: 10
Enter element 2: 20
Enter element 3: 30
Enter element 4: 40
Enter element 5: 50

Sample Output:
Sum: 150

In the sample input, the user entered 5 elements (10, 20, 30, 40, and 50), and the program calculated their sum, which is 150, and displayed the result as output.
*/

#include <iostream>

int main() {
    int n;
    int sum = 0;

    // Input the number of elements
    std::cout << "Enter the number of elements: ";
    std::cin >> n;

    // Input the elements and calculate the sum
    for (int i = 0; i < n; ++i) {
        int num;
        std::cout << "Enter element " << i + 1 << ": ";
        std::cin >> num;
        sum += num;
    }

    // Output the sum
    std::cout << "Sum: " << sum << std::endl;

    return 0;
}

