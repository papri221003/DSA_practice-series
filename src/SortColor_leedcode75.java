public class SortColor_leedcode75 {
    public static void divide(int nums[],int strt,int end)
    {
        int mid=strt+(end-strt)/2;
        if(strt>=end)
        {
            return;
        }
        divide(nums,strt,mid);
        divide(nums,mid+1,end);
        conquer(nums,strt,mid,end);
    }
    public static void conquer(int nums[],int strt,int mid,int end)
    {
        int merge[]=new int[end - strt + 1];
        int idx1=strt;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=end)
        {
            if(nums[idx1]>nums[idx2])
            {
                merge[x]=nums[idx2];
                idx2++;
                x++;
            }
            else
            {
                merge[x]=nums[idx1];
                idx1++;
                x++;
            }
        }
        while(idx1<=mid)
        {
            merge[x]=nums[idx1];
            idx1++;
            x++;
        }
        while(idx2<=end)
        {
            merge[x]=nums[idx2];
            idx2++;
            x++;
        }

        for(int i=0;i<merge.length;i++)
        {
            nums[strt+i]=merge[i];
        }
    }



    public static void sortColors(int[] nums) {
        int strt=0;
        int end=nums.length-1;
        divide(nums,strt,end);
    }
    public static void main(String[] args) {
        int nums[]={1,0,2,0,1,0,2};
        sortColors(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }


    }
}
