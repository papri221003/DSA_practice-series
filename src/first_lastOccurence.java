public class first_lastOccurence {
    public static int[] searchRange(int[] nums, int target) {
        int left=-1;
        int right=-1;
        int result[]=new int[2];
        if(nums.length==1 && nums[0]==target)
        {
            result[0]=0;
            result[1]=0;
            return result;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                left=i;
                right=i;
                while(right<nums.length && nums[right]==target)
                {
                    right++;
                }
                result[0]=left;
                result[1]=right-1;
                return result;
            }
        }
        result[0]=-1;
        result[1]=-1;
        return result;
    }

    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int result[]=searchRange(nums,target);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
