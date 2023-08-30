// O(n*2^n)
// O(1)
import java.util.Scanner;

public class PowerSet {
    public static void printPowerSet(String str) {
        int n = str.length();
        int powerSetSize = (int) Math.pow(2, n);

        for (int i = 0; i < powerSetSize; i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j) + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printPowerSet(input);
        sc.close();
    }
}
