import java.util.Scanner;

public class LinearSearch_String {
    public static int Search(String str,char ch)
    {
        if(str.length()==0)
        {
            return -1;
        }
        String lower=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(lower.charAt(i)==ch)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="ABCDEFGHIJ";
        Scanner sc= new Scanner(System.in);
        char target=sc.next().charAt(0);
        System.out.println(Search(str,target));
    }
}
