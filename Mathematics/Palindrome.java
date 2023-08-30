//O(D)
//O(1)
import java.util.Scanner;

public class Palindrome {
    static boolean isPal(int n){
        int rev=0,temp=n;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return rev==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPal(n)){
            System.out.print(n+" is a Palindrome");
        }
        else{
            System.out.print(n+" is not a Palindrome");
        }
        sc.close();
    }
}