/*A word is considered valid if:

        It contains a minimum of 3 characters.
        It contains only digits (0-9), and English letters (uppercase and lowercase).
        It includes at least one vowel.
        It includes at least one consonant.
        You are given a string word.

        Return true if word is valid, otherwise, return false.

        Notes:

        'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
        A consonant is an English letter that is not a vowel.

        Leedocode 3136

 */

import java.util.Scanner;
public class Valid_Word {
    public static boolean isValid(String word) {
        int vowel=0;
        int consonent=0;
        int digit=0;
        if(word.length()<3)
        {
            return false;
        }
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch=='$' || ch=='@' || ch== '#' || ch=='&')
            {
                return false;
            }
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowel++;
            }
            else if(ch>='0' && ch<='9')
            {
                digit++;
            }
            else
            {
                consonent++;
            }

        }

        if(vowel == 0 || consonent == 0)
        {
            return false;
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(isValid(word));

    }
}
