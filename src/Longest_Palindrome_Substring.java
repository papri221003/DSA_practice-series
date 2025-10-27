public class Longest_Palindrome_Substring {
    public static String longestPalindrome(String s) {
        String lps="";
        for(int i=0;i<s.length();i++)
        {
            //for odd palindrome
            int left=i;
            int right=i;
            while(left>-1 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
                if(left<=-1 || right>=s.length())
                {
                    break;
                }
            }
            String Palindrome=s.substring(left+1,right);
            if(lps.length()<Palindrome.length())
            {
                lps=Palindrome;
            }

            //for even palindrome
            left=i;
            right=i+1;
            while(left>-1 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
                if(left<=-1 || right>=s.length())
                {
                    break;
                }
            }
            String Palindrome1=s.substring(left+1,right);
            if(lps.length()<Palindrome1.length())
            {
                lps=Palindrome1;
            }

        }

        return lps;

    }
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));

    }
}
