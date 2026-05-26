class Array {
    public static int buyAndSell(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (buyprice < price) {
                int profit = price - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyprice = price;
            }
        }
        return maxProfit;
    }

    public class BuyAndSell {
    
    }
    
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSell(prices)); // Output: 5
    }
}


