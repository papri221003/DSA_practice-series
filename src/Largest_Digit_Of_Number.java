import java.util.Scanner;

public class Largest_Digit_Of_Number {
    public static int Find_Largest(int num)
    {
        int max=0;
        int digit=0;
        while(num!=0)
        {
            digit=num%10;
            max=Math.max(max,digit);
            num=num/10;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("The number is: "+Find_Largest(num));


    }
}