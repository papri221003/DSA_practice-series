import java.util.Scanner;

public class Divisible_By_Nine_threeDigitNum {
    public static boolean Divisible_By_nine(int num)
    {
        if(num>=100 && num<=999 && num%9==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Divisible_By_nine(num));

    }
}
