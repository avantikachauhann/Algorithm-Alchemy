/* 
A number is called happy if it leads to 1 after a sequence of steps wherein each
step number is replaced by the sum of squares of its digit that is if we start 
with Happy Number and keep replacing it with digits square sum, we reach 1. 
*/

import java.util.Scanner;

class Happynumber {
    static boolean isHappynumber(int n) {
        if (n == 1 || n == 7)
            return true;
        int sum = n, x = n;
        while (sum > 9) {
            sum = 0;
            while (x > 0) {
                int d = x % 10;
                sum += d * d;
                x /= 10;
            }
            if (sum == 1)
                return true;
            x = sum;
        }
        if (sum == 7)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find Happy Number or Not: ");
        n = sc.nextInt();
        if (isHappynumber(n))
            System.out.println(n + " is a Happy number");
        else
            System.out.println(n + " is not a Happy number");
        sc.close();
    }
}