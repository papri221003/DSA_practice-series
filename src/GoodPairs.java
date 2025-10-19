import java.util.*;
public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                count+=map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int nums[]={1,2,1,3,4,2,3,1,3};
        System.out.println(numIdenticalPairs(nums));

    }
}
