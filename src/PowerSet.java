import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        int n=nums.length;
        int totalSubset=1<<n;
        for(int mask=0;mask<totalSubset;mask++)
        {
            ArrayList<Integer>subset=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if((mask & (1<<i))!=0)
                {
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }
        return result;

    }
    public static void main(String[] args) {
        List<List<Integer>>result=new ArrayList<>();
        int nums[]={1,2,3};
        System.out.println(subsets(nums));


    }
}
