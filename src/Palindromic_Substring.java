import java.util.Scanner;

public class Palindromic_Substring {
    public static int countSubstrings(String s) {
        int count=0;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++)
        {
            //for even palindrome counting
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                count++;
                left--;
                right++;
            }

            //for odd palindrome counting
            left=i;
            right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                count++;
                left--;
                right++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        System.out.println(countSubstrings(s));


    }
}
