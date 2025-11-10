import java.util.Scanner;

public class Crossing_Road {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int nums[]=new int[t];
        for(int i=0;i<t;i++)
        {
            nums[i]=sc.nextInt();
        }
        int crossing=0;
        int north=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                north++;
            }
            else {
                crossing+=north;
            }
        }
        System.out.println(crossing);
    }
}
