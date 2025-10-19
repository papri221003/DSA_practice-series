public class Biker_vvimp {
    /*
    public static int countCrossing(int nums[])            //This will take O(n^2) t.c
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                continue;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==1)
                {
                    count++;
                }
            }
        }
        return count;

    }
    */

    public static int countCrossing(int nums[])         //This is efficient way to solve
    {
        int north=0;
        int crossing=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                north++;
            }
            else {
                crossing+=north;
            }
        }
        return crossing;
    }
    public static void main(String[] args) {
        int nums[]={0,0,0,0,0,0,0,1};
        System.out.println(countCrossing(nums));
    }
}
