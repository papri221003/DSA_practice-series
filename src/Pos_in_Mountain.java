public class Pos_in_Mountain {
    public static int search(int arr[],int target)
    {
       int peak=peakIndexInMountainArray(arr);
       int firstTry=Binary_Search(arr,target,0,peak);
       if(firstTry!=-1)
       {
           return firstTry;
       }
       return Binary_Search(arr,target,peak+1,arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;

            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }

            if(start==end)
            {
                return start;
            }
        }
        return 0;
    }

    public static int Binary_Search(int arr[],int target,int begin,int end)
    {
        boolean isAsc=arr[begin]<arr[end];
        while(begin<=end)
        {
            int mid=(begin+end)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(isAsc)
            {
                if (target>mid) {
                    begin=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else
            {
                if (target>mid) {
                    end=mid-1;
                }
                else {
                    begin=mid+1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[]= {1,2,3,4,5,3,1};
       int target = 5;
       System.out.println(search(arr,target));

    }
}
