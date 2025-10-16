public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalCost>totalGas)
        {
            return -1;
        }

        int currgas=0;
        int strtindex=0;

        for(int i=0;i<gas.length;i++)
        {
            currgas=currgas+(gas[i]-cost[i]);
            if(currgas<0)
            {
                currgas=0;
                strtindex=i+1;
            }
        }
        return strtindex;

    }

    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
