public class Bubble_Sort {
    public static void main(String args[])
    {
        int arr[]={4,8,5,9,1,24,10};
        int i=0;
        int j=0;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
