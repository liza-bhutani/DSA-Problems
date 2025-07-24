public class SellBuyStocksProblem {
    public static void main(String[] args) {
     int[] prices={7, 1, 5, 3, 6, 4};
     int mini=prices[0];
     int max_profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int cost= (prices[i]-mini);
            max_profit=Math.max(max_profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        System.out.println(max_profit);
    }
}
