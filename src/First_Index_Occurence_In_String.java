public class First_Index_Occurence_In_String {
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<=(haystack.length()-needle.length());i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                String s=haystack.substring(i,i+needle.length());
                if(s.equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;

    }
public static void main(String[] args) {
        String haystack="leedcode";
        String needle="leeco";
    System.out.println(strStr(haystack,needle));

}
}
