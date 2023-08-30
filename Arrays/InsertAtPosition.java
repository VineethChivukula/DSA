package Arrays;
// Beginning-O(n), Ending-O(1)
// O(1)
import java.util.Scanner;

public class InsertAtPosition {
    public static void insertElement(int[] arr, int size, int position, int element) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = size - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int position = sc.nextInt();
        int element = sc.nextInt();
        insertElement(arr, size, position-1, element);
        System.out.println("Array after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}