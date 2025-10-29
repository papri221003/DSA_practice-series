public class Jump_Game {
    public static boolean canJump(int[] nums) {
        int des=nums.length-1;
        int i=nums.length-2;
        if(nums.length==1)
        {
            return true;
        }
        while(i>=0)
        {
            if((i+nums[i])>=des)
            {
                des=i;
                if(des==0)
                {
                    return true;
                }
            }
            i--;
        }
        return false;

    }
    public static void main(String[] args) {
        int []arr={2,3,1,1,4};
        System.out.println(canJump(arr));

    }
}
