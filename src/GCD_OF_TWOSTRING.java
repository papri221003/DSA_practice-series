import java.util.Scanner;

public class GCD_OF_TWOSTRING {
    private static int gcd(int num1,int num2)
    {
        if(num1==num2)
        {
            return num1;
        }
        else if(num1>num2)
        {
            return gcd((num1-num2),num2);
        }
        else
        {
            return gcd(num1,(num2-num1));
        }
    }
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }

        int gcdlength=gcd(str1.length(),str2.length());

        return str1.substring(0,gcdlength);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(gcdOfStrings(str1,str2));

    }
}
