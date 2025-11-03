public class First_LastPossition_of_sorted_array {
    private static int SearchPosition(int num[],int target,boolean isStartindex)
    {
        int start=0;
        int end=num.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(num[mid]==target)
            {
                ans=mid;
                if(isStartindex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else if(num[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
    public  static int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        result[0]=SearchPosition(nums,target,true);

        result[1]=SearchPosition(nums,target,false);

        return result;

    }

    public static void main(String[] args) {
        int num[]={5,7,7,8,8,10};
        int target=8;
        int result[]=searchRange(num,target);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
