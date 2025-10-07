import java.util.Scanner;

public class Linear_Search {
    public static int linear_search(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,8,2,14,9,7,23};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements to be searched: ");
        int target=sc.nextInt();
       int pos=linear_search(arr,target);
        System.out.println(pos);
    }
}
