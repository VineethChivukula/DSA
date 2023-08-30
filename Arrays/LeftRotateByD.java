package Arrays;
// O(m)
// O(1)
import java.util.Scanner;

public class LeftRotateByD {

    public static void leftRotateByD(int[] arr, int size, int d) {
        if (size <= 1 || d <= 0 || d >= size) {
            return;
        }

        reverse(arr, 0, d - 1);
        reverse(arr, d, size - 1);
        reverse(arr, 0, size - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        leftRotateByD(arr, size, d);

        System.out.println("Array after left rotation by " + d + " positions:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
