package Leetcode_Problem_DSA.Interview_45Ques.Level02_ArraysAndStrings;

public class BestTimeToBuy {
    public static void maxProfit(int[] prices){
        int maxProfit = 0;
        int BestBuy = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(BestBuy < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i] - BestBuy);
            }

            BestBuy = Math.min(BestBuy, prices[i]);
        }

        System.out.println("MaxProfit : " + maxProfit); // 5
        System.out.println("BestBuy : " + BestBuy); // 1
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        maxProfit(prices);

    }
}
