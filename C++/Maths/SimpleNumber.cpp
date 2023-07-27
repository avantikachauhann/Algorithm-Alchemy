/*
What is a simple number?
A simple number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

Approach:
1. The user is prompted to enter a number.
2. The `isSimple` function is called with the entered number as argument.
3. The `isSimple` function checks if the number is less than or equal to 1. If so, it returns "false" as 1 and numbers less than 1 are not simple numbers.
4. The function then checks if the number is divisible by any number from 2 to the square root of the number. If the number is divisible, it returns "false".
5. If the number is not divisible by any number, it is considered a simple number and the function returns "true".
6. The main function then checks the return value of the `isSimple` function and outputs whether the number is simple or not.

Time Complexity:
The time complexity of this code is O(sqrt(num)). This is because we are iterating from 2 to the square root of the number to check if it is divisible by any number.

Space Complexity:
The space complexity of this code is O(1). This is because we are not using any additional data structures that grow with the input size.

Sample Input and Output:
1. Input: 7
   Output: 7 is a simple number.

2. Input: 12
   Output: 12 is not a simple number.

3. Input: 0
   Output: 0 is not a simple number.
*/

// C++ program to check if a number is simple or not
#include <iostream>
using namespace std;

// Function to check if a number is simple or not
bool isSimple(int num) {
    
    // 1 and less than 1 are not simple numbers
    if (num <= 1) {
        return false;
    }
    
    // Check if num is divisible by any number from 2 to sqrt(num)
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    
    // If num is not divisible by any number, it is a simple number
    return true;
}

int main() {
    int num;
    
    cout << "Enter a number: ";
    cin >> num;
    
    // Call the isSimple function to check if num is simple or not
    if (isSimple(num)) {
        cout << num << " is a simple number." << endl;
    } else {
        cout << num << " is not a simple number." << endl;
    }
    
    return 0;
}
