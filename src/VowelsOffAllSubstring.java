import java.util.Scanner;

public class VowelsOffAllSubstring {
    public static long countVowels(String word) {
        long result=0;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if(ch=='i' || ch=='o' || ch=='u' || ch=='a' || ch=='e')
            {
                result+=(long)(i+1)*(n-i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(countVowels(word));


    }
}
