// O(n)
// O(1)
import java.util.Scanner;

public class RemoveDuplicatesSorted {
    public static int removeDuplicates(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return size;
        }

        int newSize = 1;
        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        return newSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int newSize = removeDuplicates(arr, size);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}