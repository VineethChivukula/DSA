//TO:O(logn)
//SO:O(1)
import java.util.Scanner;

public class CountDigits {
    public static long countDigit(long n) {
        if (n == 0) {
            return 0;
        }
        return (long) Math.floor(Math.log10(Math.abs(n)) + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Number of digits in " + n + " is: " + countDigit(n));
        sc.close();
    }
}