class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int Buyprice = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for ( int i=0 ; i < n ; i ++){ 
            if (Buyprice < prices[i]){
                int profit = prices[i] - Buyprice;
                Maxprofit = Math.max(profit ,Maxprofit);
            }else {
                Buyprice = prices[i];
            }
           
        }
         return Maxprofit;

    }
}
