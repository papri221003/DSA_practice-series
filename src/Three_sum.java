import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_sum {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target=-nums[i];
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=nums[left]+nums[right];
                if(sum==target)
                {
                    List<Integer>list=Arrays.asList(nums[i],nums[left],nums[right]);
                    result.add(list);
                    while(left<right && nums[left]==nums[left+1])
                    {
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1])
                    {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum>target)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return result;
    }
}
