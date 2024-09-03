import java.util.Arrays;
import java.util.Random;

class StockPProfit{
    public static int FindMaximumProfit(int[] prices){
        long startTime = System.nanoTime();
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            int buyPrice = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int sellPrice = prices[j];
                int Profit = sellPrice - buyPrice;
                if(Profit > maxProfit){
                    maxProfit = Profit;
                }
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("duration: " + duration);
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Max Profit prices1: " + FindMaximumProfit(prices1)); //5
        System.out.println("Max Profit prices2: " + FindMaximumProfit(prices2)); //0

        
        // int length = 20;
        // int maxPrice = 20;
        // int[] prices = new int[length];
        
        // Random random = new Random();
        // for (int i = 0; i < length; i++){
        //     prices[i] = random.nextInt(maxPrice);
        // }

        // System.out.println("prices: " + Arrays.toString(prices));
        // System.out.println("Max Profit: " + FindMaximumProfit(prices));
    }
}