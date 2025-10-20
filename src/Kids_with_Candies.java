import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kids_with_Candies {
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
            {
                max=candies[i];
            }
        }

        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int extracandies=sc.nextInt();
        int candies[]=new int[n];
        for(int i=0;i<candies.length;i++)
        {
            candies[i]=sc.nextInt();
        }
        ArrayList<Boolean> list=kidsWithCandies(candies,extracandies);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }

    }
}
