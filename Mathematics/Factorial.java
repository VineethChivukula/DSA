//O(n)
//O(1)
import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        int res=1;
        for (int i = 2 ;i<=n;i++ ){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is :"+fact(n));
        sc.close();
    }    
}