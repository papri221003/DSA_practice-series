public class Binary_Search {
    public static void main(String[] args) {
        int arr[]={1,4,7,8,9,10,12};
        int num=10;
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==num)
            {
                System.out.println(mid);
                break;

            }
            else if (arr[mid]>num)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
    }
}
