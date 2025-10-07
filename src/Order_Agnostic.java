public class Order_Agnostic {
    public static boolean isAsc(int arr[])
    {
        int start=arr[0];
        int last=arr[arr.length-1];

        if(start<last)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static int Binary_Search(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        int begin=0;
        int end=arr.length-1;
        while(begin<end)
        {
            int mid=(begin+end)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(isAsc(arr))
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
        int arr[]={45,49,52,56,58,60,67,75,84,91};
        int arr1[]={98,85,84,80,79,78,75,72,71,64,58,52,10};
        int target=75;

        System.out.println(Binary_Search(arr,target));
        System.out.println(Binary_Search(arr1,target));


    }
}
