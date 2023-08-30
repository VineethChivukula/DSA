// O(n)
// O(1)
import java.util.Scanner;

public class TwoOddAppearingElements {
    public static void findTwoOddAppearingElements(int[] arr) {
        int xorResult = 0;
        for (int num : arr) {
            xorResult ^= num;
        }

        int setBit = xorResult & -xorResult; // Finding the rightmost set bit

        int odd1 = 0, odd2 = 0;
        for (int num : arr) {
            if ((num & setBit) != 0) {
                odd1 ^= num;
            } else {
                odd2 ^= num;
            }
        }

        System.out.println("The two odd appearing elements are: " + odd1 + " and " + odd2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findTwoOddAppearingElements(arr);
        sc.close();
    }
}