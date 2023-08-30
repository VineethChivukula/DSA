package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr, int size) {
        int nonZeroIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex]=temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        moveZerosToEnd(arr, size);

        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}