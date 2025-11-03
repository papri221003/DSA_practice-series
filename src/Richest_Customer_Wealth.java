public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int max=0;
        for(int i=0;i<m;i++)
        {
            int currsum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                currsum+=accounts[i][j];
            }
            if(currsum>max)
            {
                max=currsum;
            }
        }
        return max;

    }
    public static void main(String[] args) {

        int accounts[][]={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

    }
}
