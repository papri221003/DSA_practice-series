import java.util.*;
public class Sum_of_table {
    public static int sum(int n)
    {
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            sum+=(n*i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
