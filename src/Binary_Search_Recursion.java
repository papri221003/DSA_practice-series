public class Binary_Search_Recursion {
    public static int BinarySearch_Recursion(int arr[],int start,int end,int target)
    {
        int mid=(start+end)/2;
        if(arr[mid]==target)
        {
            return mid;
        } else if (arr[mid]>target)
        {
            return BinarySearch_Recursion(arr,start,mid-1,target);
        }
        else {
            return BinarySearch_Recursion(arr,mid+1,end,target);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,8,9,12,16,18};
        int target=12;
        int start=0;
        int end=arr.length-1;
        System.out.println(BinarySearch_Recursion(arr,start,end,target));

    }
}
