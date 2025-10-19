public class SubstractProduct_and_Sum {
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        int num=n;
        while(num!=0)
        {
            int digit=num%10;
            sum+=digit;
            mul*=digit;
            num=num/10;
        }
        return mul-sum;

    }
    public static void main(String[] args) {
        int num=1581;
        System.out.println(subtractProductAndSum(num));

    }
}
