import java.util.Scanner;

public class qs1_sum_of_prime {
    public static boolean IsPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        if(num==2)
        {
            return true;
        }
        if(num%2==0)
        {
            return false;
        }


        for(int i=3;i<=(num/2);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(IsPrime(i))
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }

}
