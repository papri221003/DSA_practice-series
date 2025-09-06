import java.util.*;
public class OneS_Compliment {
    public static String Conversion(int num)
    {
        String res="";
        if(num==0)
        {
            res=0+res;
            return res;
        }
        while(num!=0)
        {
            if(num%2==1)
            {
                res=1+res;
            }
            else {
                res=0+res;
            }
            num=num/2;
        }
        return res;
    }
    public static String Compliment1s(int num)
    {
        String result=Conversion(num);
        String result1="";
        for(int i=0;i<result.length();i++)
        {
            if(result.charAt(i)=='1')
            {
                result1=result1+0;
            }
            else {
                result1=result1+1;
            }
        }
        return result1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal no: ");
        int decimal = sc.nextInt();
        String result=Conversion(decimal);
        System.out.println(result);
        System.out.println("The 1's Compliment is: "+Compliment1s(decimal));


    }
}
