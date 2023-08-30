package Arrays;
// Beginning-O(n), Ending-O(1)
// O(1)
import java.util.Scanner;

public class DeleteAtPosition {
    public static void deleteElement(int[] arr, int size, int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int position = sc.nextInt();
        deleteElement(arr, size, position - 1);
        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
