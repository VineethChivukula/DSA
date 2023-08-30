package Recursions;
// O(D)
// O(D)
import java.util.Scanner;

public class SumOfDigitsRecursion {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
        sc.close();
    }
}