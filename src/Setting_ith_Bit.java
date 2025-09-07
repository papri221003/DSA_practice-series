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

    public static int Toggle_ithBit(int num,int i)
    {
        int n=1<<i;
        int result=num ^ n;
        return result;
    }

    public static int Remove_last_SetBit(int num)
    {
        int result=num & num-1;
        return result;
    }

    public static boolean Check_Power_Two(int num)
    {
        if((num & (num-1))==0)
        {
            return true;
        }
        else
            return false;
    }

    public static int Count_SetBit(int num)
    {
        int count=0;
        while(num>1)
        {
            if((num&1)==1)
            {
                count++;
                num=num>>1;
            }
        }
        if(num==1)
        {
            count ++;
        }
        return count;
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
        int result2=Toggle_ithBit(num,i);
        System.out.println(result2);
        int result3=Remove_last_SetBit(num);
        System.out.println(result3);
        boolean result4=Check_Power_Two(num);
        System.out.println(result4);
        int result5=Count_SetBit(num);
        System.out.println(result5);


    }
}
