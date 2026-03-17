import java.util.Scanner;

public class Factorial {
    public static int factorial_number(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        return num*factorial_number(num-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("Factorial number is: "+factorial_number(num));

    }
}
