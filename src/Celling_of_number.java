public class Celling_of_number {
    public static int celling(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 5, 9, 14, 16, 18};
        int target=6;
        int result=celling(arr,target);
        System.out.println(result);

    }
}
