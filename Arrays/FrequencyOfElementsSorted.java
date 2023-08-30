package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class FrequencyOfElementsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = sc.nextInt();
        }
        sc.close();
        calculateFrequency(sortedArray);
    }

    public static void calculateFrequency(int[] arr) {
        int n = arr.length;
        int freq=1,i=1;
        while(i<n){
            while(i<n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println("Element "+arr[i - 1]+ " occurs frequency of "+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println("Element "+arr[n-1]+ " occurs frequency of"+freq);
        }
    }
}