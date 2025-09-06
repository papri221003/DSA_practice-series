import java.util.*;
public class Check_set_ithBit {
    public static boolean CheckIthBit(int num,int i)
    {
        int n=1<<i;
        if((num & n)!=0){
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
        boolean res=CheckIthBit(num,i);
        System.out.println(res);

    }
}
