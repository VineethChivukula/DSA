package Arrays;
// O(n)
// O(1)
import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        sc.close();
        int maxProfit = calculateMaxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }

    public static int calculateMaxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}