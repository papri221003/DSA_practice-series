public class Jump_Game2 {
    public static int jump(int[] nums) {
        int lastJumpIndex=0;
        int coverage=0;
        int des=nums.length-1;
        int totalJump=0;
        if(nums.length==1)
        {
            return 0;
        }

        for(int i=0;i<nums.length;i++)
        {
            coverage=Math.max(coverage,(nums[i]+i));
            if(coverage>=des)
            {
                totalJump++;
                return totalJump;
            }
            if(i==lastJumpIndex)
            {
                lastJumpIndex=coverage;
                totalJump++;
            }
        }
        return totalJump;

    }
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        System.out.println(jump(nums));

    }
}
