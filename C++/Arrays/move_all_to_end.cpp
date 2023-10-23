// ------------>  Move all Zeros to the end of the array <-----------------
// Algorithm:
// Here I've used two pointers approach.
// Steps:

// Declare 2 pointers i and j.
// Initialize i at 0 and j at 1.
// Run the while loop until j is less than n (size of the array).
// Now use if-else statements to compare.
// If the value at both i and j index is 0, move the j pointer by 1 position.
// If the value at i is 0 and value at j index is not zero, swap both the values and move both the pointers by 1 position.
// In else case, move both the pointers by 1 position.
//                                                      TC ==> O(N), SC==> O(1)
#include <bits/stdc++.h>
using namespace std;
void moveZeroes(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        int j = 1;
        while(j<n){
            if(nums[i]==0 && nums[j]!=0){
                swap(nums[i],nums[j]);
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
int main()
{
    vector<int> arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
    int n = 10;
    vector<int> ans = moveZeros(n, arr);
    for (auto &it : ans) {
        cout << it << " ";
    }
    cout << '\n';
    return 0;
}
