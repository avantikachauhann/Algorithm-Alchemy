/*
Approach:
- Shell Sort is an extension of the insertion sort algorithm that works by sorting subarrays.
- It starts by sorting elements that are far apart, and gradually reduces the gap between elements to be compared.
- The algorithm uses a sequence of gaps or steps, which depends on the chosen gap sequence.

Time Complexity: O(n^2) in the worst case. With the right gap sequence, it can be improved to O(n log^2 n).

Space Complexity: O(1) - It is an in-place sorting algorithm.

Sample Input:
{12, 34, 54, 2, 3}

Sample Output:
Sorted Array: [2, 3, 12, 34, 54]
*/

#include <iostream>
#include <vector>

using namespace std;

void shellSort(vector<int> &arr) {
    int n = arr.size();

    // Choose the gap sequence. Here, we use the Knuth sequence.
    int gap = 1;
    while (gap < n / 3) {
        gap = 3 * gap + 1;
    }

    while (gap > 0) {
        for (int i = gap; i < n; i++) {
            int temp = arr[i];
            int j = i;
            while (j >= gap && arr[j - gap] > temp) {
                arr[j] = arr[j - gap];
                j -= gap;
            }
            arr[j] = temp;
        }
        gap /= 3;
    }
}

int main() {
    vector<int> arr = {12, 34, 54, 2, 3};
    shellSort(arr);

    cout << "Sorted Array: [";
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i];
        if (i < arr.size() - 1) {
            cout << ", ";
        }
    }
    cout << "]" << endl;

    return 0;
}
