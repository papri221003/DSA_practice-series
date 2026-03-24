public class Odd_numbers_In_a_Array {
    public static int countOddArray(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,8,5,2,4,6,3,7};
        System.out.println(countOddArray(arr));

    }
}
