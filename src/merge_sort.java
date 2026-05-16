public class merge_sort {
    public static void divide(int strt,int end,int arr[])
    {
        int mid=strt+(end-strt)/2;
        if(strt>=end)
        {
            return;
        }
        divide(strt,mid,arr);
        divide(mid+1,end,arr);
        conquer(strt,end,mid,arr);
    }
    public static void conquer(int strt,int end,int mid,int arr[])
    {
        int merged[]=new int[end-strt+1];
        int idx1=strt;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=end)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[x]=arr[idx1];
                idx1++;
                x++;
            }
            else {
                merged[x]=arr[idx2];
                idx2++;
                x++;
            }
        }
        while(idx1<=mid)
        {
            merged[x]=arr[idx1];
            idx1++;
            x++;
        }

        while(idx2<=end)
        {
            merged[x]=arr[idx2];
            idx2++;
            x++;
        }

        for(int k=0;k<merged.length;k++)
        {
            arr[strt+k]=merged[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,8,4,6,7,9,2,3,40,48};
        divide(0,arr.length-1,arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
