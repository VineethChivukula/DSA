// O(log n)
// O(1)

import java.util.Scanner;

public class CountBits {
    public static int countBits(int n){
        int res=0;
        while(n>0){
            n=(n&(n-1));
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("No of set bits in "+ n + " is " +countBits(n));
        sc.close();    
    }
}