import java.util.*;
public class Setting_ith_Bit {
    public static int Set_ithBit(int num,int i)
    {
        int n=1<<i;
        int result=num|n;
        return result;
    }
    public static int Clear_ithBit(int num,int i)
    {
        int n=1<<i;
        int n1=~n;
        int result=num & n1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The number is: ");
        int num=sc.nextInt();
        System.out.println("The i is: ");
        int i=sc.nextInt();
        int result=Set_ithBit(num,i);
        System.out.println(result);
        int result1=Clear_ithBit(num,i);
        System.out.println(result1);


    }
}
