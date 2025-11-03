import java.util.*;
public class Union_Of_Two_Array {
    public static int[] union(int num1[],int num2[])
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<num1.length;i++)
        {
            set.add(num1[i]);
        }
        for(int i=0;i<num2.length;i++)
        {
            set.add(num2[i]);
        }

        int result[]=new int[set.size()];
        int i=0;
        Iterator<Integer>it= set.iterator();
        while(it.hasNext())
        {
            result[i]=it.next();
            i++;
        }

        return result;

    }
    public static void main(String[] args) {
        int num1[]={1,2,2,4};
        int num2[]={2,2,4,5};

        int result[]=union(num1,num2);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}
