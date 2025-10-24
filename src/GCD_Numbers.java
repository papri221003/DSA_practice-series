import java.util.Scanner;

public class GCD_Numbers {
    public static int GCD(int num1,int num2)
    {
        if(num1==num2)
        {
            return num1;
        }
        else if(num1>num2)
        {
            return GCD((num1-num2),num2);
        }
        else {
            return GCD(num1, (num2 - num1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=GCD(num1,num2);
        System.out.println(result);
    }
}
