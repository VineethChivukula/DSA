package Recursions;
// O(n)
// O(n)
import java.util.Scanner;

public class Josephus {
    public static int jos(int n,int k){
        if (n==1)
            return 0;
        return (jos(n-1,k)+k)%n; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pos= sc.nextInt();
        System.out.println("The position of the survivor is "+jos(n,pos));
        sc.close();
    }
}