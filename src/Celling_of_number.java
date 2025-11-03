public class Celling_of_number {
    public static int celling_number(int num[],int target)
    {
        int start=0;
        int end=num.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(num[mid]==target)
            {
                return num[mid];
            } else if (num[mid]>target)
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return num[start];
    }
    public static void main(String[] args) {
        int num[]={2,3,5,9,14,16,18};
        int target=15;

        System.out.println(celling_number(num,target));

    }
}
