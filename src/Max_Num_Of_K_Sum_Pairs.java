import java.util.HashMap;

public class Max_Num_Of_K_Sum_Pairs {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int curr=k-nums[i];
            if(map.containsKey(curr) && map.get(curr)>0)
            {
                count++;
                map.put(curr,map.get(curr)-1);
            }
            else if(map.containsKey(nums[i]))
            {
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
        int[] nums = {2, 2, 2, 2};
        int k = 4;
        System.out.println(maxOperations(nums,k));
    }
}
