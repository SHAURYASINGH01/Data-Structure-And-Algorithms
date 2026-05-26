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
}

