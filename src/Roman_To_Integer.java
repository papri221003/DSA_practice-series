import java.util.*;
public class Roman_To_Integer {
    public static int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            char c=s.charAt(i);
            char ch=s.charAt(i+1);
            if(map.get(c)>=map.get(ch))
            {
                sum+=map.get(c);
            }
            else
            {
                sum-=map.get(c);
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(romanToInt(s));

    }
}
