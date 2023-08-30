package Recursions;
// O(2^n)
// O(n)
import java.util.Scanner;

public class TOH {
    public static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDisks = sc.nextInt();
        solveTowerOfHanoi(numDisks, 'A', 'B', 'C');
        sc.close();
    }
}