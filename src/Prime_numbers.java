public class Prime_numbers {
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int sum_of_prime(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println(sum_of_prime(n));    //calculate th sum of the prime 1 to n
    }
}
