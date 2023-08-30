package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class LargestElementIndex {
    public static int findLargestElementIndex(int[] arr, int size) {
        int largestIndex = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[largestIndex]) {
                largestIndex = i;
            }
        }

        return largestIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int largestIndex = findLargestElementIndex(arr, size);
        System.out.println("The largest element is at index: " + largestIndex);

        sc.close();
    }
}