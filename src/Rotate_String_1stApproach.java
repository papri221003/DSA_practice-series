//Rotate String First Approach
public class Rotate_String_1stApproach {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        if((s+s).contains(goal))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(rotateString(s,goal));
    }
}
