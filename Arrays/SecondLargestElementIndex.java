package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class SecondLargestElementIndex {
    public static int findSecondLargestElementIndex(int[] arr, int size) {
        int largestIndex = 0;
        int secondLargestIndex = -1;

        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[largestIndex]) {
                secondLargestIndex = largestIndex;
                largestIndex = i;
            } else if (arr[i]!=arr[largestIndex]) {
                if(secondLargestIndex == -1 || arr[i] > arr[secondLargestIndex])
                    secondLargestIndex = i;
            }
        }

        return secondLargestIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargestIndex = findSecondLargestElementIndex(arr, size);
        System.out.println("The second largest element is at index: " + secondLargestIndex);

        sc.close();
    }
}
