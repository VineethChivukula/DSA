package Recursions;
// O(3^n)
// O(n)
import java.util.Scanner;

public class CuttingRopeRecursion {
    public static int maxPieces(int n, int a,int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0){
            return -1;
        }
        
        int res=Math.max(maxPieces(n-a,a,b,c),maxPieces(n-b,a,b,c));
        res=Math.max(res,maxPieces(n-c,a,b,c));
        if (res==-1){
            return -1;
        }
        return res+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = maxPieces(length, a, b, c);
        
        System.out.println("Maximum pieces after cutting the rope is: " + result);
        
        sc.close();
    }
}
