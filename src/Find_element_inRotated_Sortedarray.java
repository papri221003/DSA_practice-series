public class Find_element_inRotated_Sortedarray {
    public static int searchPoint(int arr[],int target)
    {
        int pivot= pivot(arr);
        int firsttry=Binary_Search(arr,target,0,pivot);
        if(firsttry!=-1)
        {
            return firsttry;
        }
        return Binary_Search(arr,target,pivot+1,arr.length-1);
    }
    public static int Binary_Search(int arr[],int target,int begin,int end)
    {
        while(begin<=end)
        {
            int mid=(begin+end)/2;
            if(target==arr[mid])
            {
                return mid;
            }

                else if (target>mid) {
                    begin=mid+1;
                }
                else {
                    end=mid-1;
                }
        }
        return -1;

    }
    public static int pivot(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        //case 1
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid-1>=0 && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<arr[start])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=1;
        System.out.println(searchPoint(arr,target));

    }
}
