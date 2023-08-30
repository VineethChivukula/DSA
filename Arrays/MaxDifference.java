package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class MaxDifference {
    public static int maxDifference(int[] arr, int size) {
        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];

        for (int j = 1; j < size; j++) {
            maxDiff = Math.max(maxDiff, arr[j] - minElement);
            minElement = Math.min(minElement, arr[j]);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxDifference(arr, size);
        System.out.println("Maximum difference: " + result);

        sc.close();
    }
}