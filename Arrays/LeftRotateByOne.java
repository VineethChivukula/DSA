package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class LeftRotateByOne {
    public static void leftRotateByOne(int[] arr, int size) {
        if (size <= 1) {
            return;
        }

        int firstElement = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = firstElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        leftRotateByOne(arr, size);

        System.out.println("Array after left rotation by one:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}