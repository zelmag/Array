/*If you were only permitted to complete at most one transaction 
(i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.*/
class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0; //index of buy
        int sell = 0; //index of sell
        int maxP = 0; 
        //looking for a pair with biggest difference
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[buy]){ //reset buy and sell index
                buy=i;
                sell= i;
            }else if(prices[i]>prices[sell]){
                sell=i;
            }
            if(prices[sell]-prices[buy] > maxP && buy <sell){
                maxP = prices[sell]-prices[buy];
            }
        }
        return maxP;
    }
}
