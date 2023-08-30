// O(sqrt(n))
// O(1)
import java.util.Scanner;

public class Divisors {
    public static void printDivisors(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }
        if (i * i == n) {
            System.out.print(" " + i);
        }
        for (i = i - 1; i >= 1; i--) {
            if (n % i == 0) {
                System.out.print(" " + n / i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDivisors(n);
        sc.close();
    }
}
