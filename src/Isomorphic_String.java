import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic_String {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!map.containsKey(c) && map.containsValue(t.charAt(i)))
            {
                return false;
            }
            else if(map.containsKey(c) && map.get(c)!=t.charAt(i))
            {
                return false;
            }
            else
            {
                map.put(c,t.charAt(i));
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        System.out.println(isIsomorphic(s,t));
    }
}
