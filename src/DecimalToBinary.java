import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String res="";
        System.out.println("Enter a decimal no: ");
        int decimal = sc.nextInt();
        int num=decimal;
        if(num==0)
        {
            res=0+res;
            System.out.println("The binary no is: "+0);
            return;
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
        System.out.println("The binary no is: "+res);

    }
}
