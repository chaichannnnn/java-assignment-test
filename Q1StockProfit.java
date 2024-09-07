import java.util.Arrays;
import java.util.Scanner;

public class Q1StockProfit{
    public static int FindMaximumProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 0; i < prices.length; i++){
            
            //find minimum price
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            
            //find max profit
            int profit = prices[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("input lenght: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("price " + (i+1) + ": ");
            prices[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("prices: " + Arrays.toString(prices));
        System.out.println("Max Profit: " + FindMaximumProfit(prices));
    }
}