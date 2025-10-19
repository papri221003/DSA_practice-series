import java.util.Scanner;

public class MergeString {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<word1.length() && i<word2.length())
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while(i<word1.length())
        {
            sb.append(word1.charAt(i));
            i++;
        }
        while(i<word2.length())
        {
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();

        System.out.println(mergeAlternately(word1,word2));

    }
}
