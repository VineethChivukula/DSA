package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class CheckSorted {
    public static boolean isSorted(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean sorted = isSorted(arr, size);
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        sc.close();
    }
}
