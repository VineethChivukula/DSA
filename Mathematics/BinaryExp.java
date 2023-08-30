// O(log n)
// O(1)
import java.util.Scanner;

public class BinaryExp {
    public static int power(int x,int n){
        int res=1;
        if (n==0) 
            return res;
        while(n>0){
            if(n%2!=0)
                res*=x;
            x*=x;
            n/=2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Power of "+x+"^"+n+":" +power(x,n));
        sc.close();
    }
}