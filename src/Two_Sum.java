import java.util.*;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int sum=target-nums[i];
            if(map.containsKey(sum))
            {
                result[0]=i;
                result[1]=map.get(sum);
                return result;
            }
            map.put(nums[i],i);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        int result[]=twoSum(nums,target);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}
