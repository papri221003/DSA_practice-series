import java.util.Scanner;

public class MaxDiff_Largest_SmallestNum {
    public static int max_diff(int num[])
    {
        int min=num[0];
        int maxDiff=0;
        for(int i=1;i<num.length;i++)
        {
            int curr=num[i];
            if(curr<min)
            {
                min=curr;
                continue;
            }
            int diff=num[i]-min;
            maxDiff=Math.max(maxDiff,diff);
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }

        System.out.println(max_diff(num));

    }
}
