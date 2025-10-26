import java.util.Scanner;

public class Length_Of_Last_Word {
    public static int lengthOfLastWord(String s) {
        int i=s.length()-1;
        if(s.length()==1)
        {
            return 1;
        }

        while(s.charAt(i) == ' ' && i>=0)
        {
            i--;
        }
        int j=i;
        while(i>=0 && s.charAt(i)!= ' ')
        {
            i--;
        }
        int length=j-i;
        return length;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLastWord(s));

    }
}
