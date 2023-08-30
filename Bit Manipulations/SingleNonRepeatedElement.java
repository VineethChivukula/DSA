// O(n)
// O(1)
import java.util.Scanner;

public class SingleNonRepeatedElement {
    public static int findSingleNonRepeatedElement(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n ; ++i){
            arr[i] = sc.nextInt();
        }
        int result = findSingleNonRepeatedElement(arr);
        System.out.println("The single non-repeated element is: " + result);
        sc.close();
    }
}
