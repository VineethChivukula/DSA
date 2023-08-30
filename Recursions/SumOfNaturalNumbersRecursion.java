package Recursions;
// O(n)
// O(n)
import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
        sc.close();
    }
}