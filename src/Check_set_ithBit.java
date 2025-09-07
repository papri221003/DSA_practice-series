import java.util.*;
public class Check_set_ithBit {
    public static boolean CheckIthBit_leftShift(int num,int i)
    {
        int n=1<<i;
        if((num & n)!=0){
            return true;
        }
        else
            return false;
    }

    public static boolean CheckIthBit_rightShift(int num,int i)
    {
        int n=num>>i;
        if((n & 1)!=0){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Enter the ith possition: ");
        int i=sc.nextInt();
        boolean res=CheckIthBit_leftShift(num,i);
        System.out.println(res);

        System.out.println();
        boolean res1=CheckIthBit_rightShift(num,i);
        System.out.println(res1);

    }
}
