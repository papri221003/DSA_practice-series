import java.util.*;
public class MinBit_Flip {
    public static int min_bitFlip_toConver(int start,int goal)
    {
        int num=start^goal;
        int count=0;
        while(num>0)
        {
            num=(num & (num-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int start=sc.nextInt();
        int goal=sc.nextInt();
        int result=min_bitFlip_toConver(start,goal);
        System.out.println("Minimum bit to flip the number: "+result);
    }
}
