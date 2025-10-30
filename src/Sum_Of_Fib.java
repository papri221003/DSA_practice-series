public class Sum_Of_Fib {
    public static int fib_sum(int a,int b,int term,int n)
    {
        if(term==n)
        {
            return a;
        }
        return a+fib_sum(a,(a+b),term+1,n);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        System.out.println(fib_sum(a,b,1,n));

    }
}
