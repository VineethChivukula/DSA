// O(n log log n)
// O(n)
import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    public static void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for (int i=2;i<=isPrime.length-1;++i){
            if (isPrime[i]){
                System.out.println(i+" ");
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sieve(n);
        sc.close();
    }
}
