// O(1)
// O(1)
import java.util.Scanner;

public class IsPower2 {
    public static boolean isPow2(int n){
        if (n==0){
            return false;
        }
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (isPow2(n))
            System.out.println(n+" is a power of 2");
        else
            System.out.println(n+" is not a power of 2");       
        sc.close();
    }
}