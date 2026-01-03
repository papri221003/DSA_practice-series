public class BestTime_Buy_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int CostPrice=prices[0];
        int Profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(CostPrice<prices[i])
            {
                int pr=prices[i]-CostPrice;
                Profit=Math.max(Profit,pr);
            }
            else
            {
                CostPrice=prices[i];
            }
        }
        return Profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
