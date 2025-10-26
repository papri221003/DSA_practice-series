import java.util.Scanner;

public class CoinSplitter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        //now we have to sort the array
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        int sum=0;
        for(int i=0;i<(n/2);i++)
        {
            sum=sum+(arr[i]-arr[n-i-1]);
        }
        System.out.println(sum);
    }
}
