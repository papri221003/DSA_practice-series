//Rotate String_2nd Approach(Not Much Efficient)
public class Rotate_String_Second_Approach {
    public static boolean rotateString(String s, String goal) {
        int k=1;
        int n=s.length();
        if(s.length()!=goal.length())
        {
            return false;
        }
        while(k<=s.length())
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                sb.append(s.charAt((i+k)%n));
                if(sb.toString().equals(goal))
                {
                    return true;
                }
            }
            k++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(rotateString(s,goal));
    }
}
