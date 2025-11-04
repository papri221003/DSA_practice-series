public class Sort_Colours_qsTcs26 {
    public static void divide(int nums[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid=(start+end)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        conquer(nums,start,end,mid);
    }
    public static void conquer(int nums[],int start,int end,int mid)
    {
        int merged[]=new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=end)
        {
            if(nums[idx1]<nums[idx2])
            {
                merged[x]=nums[idx1];
                idx1++;
                x++;
            }
            else
            {
                merged[x]=nums[idx2];
                idx2++;
                x++;
            }
        }
        while(idx1<=mid)
        {
            merged[x]=nums[idx1];
            idx1++;
            x++;
        }
        while(idx2<=end)
        {
            merged[x]=nums[idx2];
            idx2++;
            x++;
        }
        for(int i=0;i<merged.length;i++)
        {
            nums[start+i]=merged[i];
        }

    }

    public static void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        divide(nums,start,end);

    }

    public static void main(String[] args) {
        int nums[]={2,2,0,0,1,1};
        sortColors(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
