public class Prime_Number {
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=17;
        System.out.println(isPrime(n));
    }


}
