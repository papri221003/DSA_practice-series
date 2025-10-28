import java.util.*;
public class Longest_Substring_Without_repeatingCharacter {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int right=0;
        int left=0;
        int size=0;
        for(right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int length=set.size();
            size=Math.max(length,size);
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
}
