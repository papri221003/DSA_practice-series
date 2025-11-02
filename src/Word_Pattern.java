import java.util.HashMap;

public class Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        String sentence[]=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        if(pattern.length()!=sentence.length)
        {
            return false;
        }

        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(map.containsKey(ch) && !map.get(ch).equals(sentence[i]))
            {
                return false;
            }

            if(!map.containsKey(ch) && map.containsValue(sentence[i]))
            {
                return false;
            }

            map.put(ch,sentence[i]);
        }
        return true;

    }

    public static void main(String[] args) {
       String pattern = "abba";
       String s= "dog cat cat dog";

        System.out.println(wordPattern(pattern,s));
    }
}
