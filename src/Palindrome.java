public class Palindrome {

    public static boolean palindromeCheck(int num)
    {
        if(num<0)
        {
            return false;
        }
        int n=num;
        int reverse=0;
        while(n!=0)
        {
            int digit=n%10;
            reverse=(reverse*10)+digit;
            n=n/10;
        }
        if(reverse==num)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num=1221;
        System.out.println(palindromeCheck(num));


    }
}
