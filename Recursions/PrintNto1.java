package Recursions;
// O(n)
// O(n)
import java.util.Scanner;

public class PrintNto1 {
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }
}