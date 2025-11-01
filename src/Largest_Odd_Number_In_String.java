public class Largest_Odd_Number_In_String {
    public static String largestOddNumber(String num) {
        int left=0;
        int right=num.length()-1;

        while(right>=0 && num.charAt(right)%2==0)
        {
            right--;
        }

        while(left<num.length() && num.charAt(left)==0)
        {
            left++;
        }

        return num.substring(left,right+1);

    }
    public static void main(String[] args) {
        String num="3526";
        System.out.println(largestOddNumber(num));

    }
}
