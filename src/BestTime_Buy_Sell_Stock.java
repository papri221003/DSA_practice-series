public class BestTime_Buy_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int cost_p=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(cost_p>prices[i])
            {
                cost_p=prices[i];
                continue;
            }
            int profit=prices[i]-cost_p;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
