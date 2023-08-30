package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class LeadersInArray {
    public static void findLeaders(int[] arr, int size) {
        int ldr = arr[size - 1];
        System.out.print(ldr + " ");

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > ldr) {
                ldr = arr[i];
                System.out.print(ldr + " ");
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

        System.out.println("Leaders in the array:");
        findLeaders(arr, size);

        sc.close();
    }
}
