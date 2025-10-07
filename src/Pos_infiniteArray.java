public class Pos_infiniteArray {
    public static int binarySearch(int arr[],int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return 0;
    }

    public static int ans(int arr[],int target)
    {
        int start=0;
        int end=1;

        while(arr[end]<target)
        {
            int temp=end+1;
            end=end+(((end-start)+1)*2);
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    public static void main(String[] args) {
        int arr[]={2,8,5,14,15,16,18,24,25,29,30,32,35,36,38,3,42,45,46,48,49,52,58,100,105,175,196};
        int target=24;

        System.out.println(ans(arr,target));

    }
}
