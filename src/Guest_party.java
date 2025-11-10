import java.util.Scanner;

public class Guest_party {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int entry[]=new int[n];
        int leave[]=new int[n];


        for(int i=0;i<n;i++)
        {
            entry[i]=sc.nextInt();

        }

        for(int i=0;i<n;i++)
        {

            leave[i]=sc.nextInt();
        }

        int sum=0;
        int max=0;

        for(int i=0;i<n;i++)
        {
            sum=(sum+entry[i])-leave[i];
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
