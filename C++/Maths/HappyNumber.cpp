#include <iostream>
#include <unordered_set>

bool isHappyNumber(int n) {
    std::unordered_set<int> seen;

    while (n != 1 && seen.find(n) == seen.end()) {
        seen.insert(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        n = sum;
    }

    return n == 1;
}

int main() {
    int n;
    std::cout << "Enter a number to find if it is a Happy Number or Not: ";
    std::cin >> n;
    
    if (isHappyNumber(n)) {
        std::cout << n << " is a Happy number" << std::endl;
    } else {
        std::cout << n << " is not a Happy number" << std::endl;
    }

    return 0;
}
