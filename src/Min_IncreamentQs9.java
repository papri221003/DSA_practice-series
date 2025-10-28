import java.util.Arrays;

public class Min_IncreamentQs9 {
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int uniquenum=nums[0];
        int move=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<uniquenum)
            {
                move=move+(uniquenum-nums[i]);
            }
            else
            {
                uniquenum=nums[i];
            }
            uniquenum++;
        }
        return move;

    }
    public static void main(String[] args) {
        int nums[]={3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));

    }
}
