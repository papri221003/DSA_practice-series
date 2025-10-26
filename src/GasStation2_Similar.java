public class GasStation2_Similar {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int currgas=0;
        int startindex=0;
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost)
        {
            return -1;
        }
        for(int i=0;i<gas.length;i++)
        {
            currgas=(currgas+gas[i])-cost[i];
            if(currgas<0)
            {
                currgas=0;
                startindex=i+1;
            }
        }
        return startindex;

    }
    public static void main(String[] args) {
        int gas[]={2,3,4};
        int cost[]={3,4,3};
        System.out.println(canCompleteCircuit(gas,cost));

    }
}
