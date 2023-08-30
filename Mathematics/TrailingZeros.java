//O(logn)
//O(1)
import java.util.Scanner;

public class TrailingZeros {
    static int countTrailingZeros(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+(n/i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("The no of Trailing Zeros are "+countTrailingZeros(n));
        sc.close();
    }
}