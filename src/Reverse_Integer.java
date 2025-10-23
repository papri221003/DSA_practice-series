public class Reverse_Integer {
    public static int reverse(int x) {
        int num=x;
        int result=0;
        while(num!=0)
        {
            int digit=num%10;
            // Check for overflow before it happens
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            result=(result*10)+digit;
            num=num/10;
        }
        return result;

    }
    public static void main(String[] args) {
        int num=123;
        System.out.println(reverse(num));

    }
}
