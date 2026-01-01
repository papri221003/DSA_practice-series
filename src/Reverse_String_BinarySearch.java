public class Reverse_String_BinarySearch {
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=s[left];
            s[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
       char s[]={'s','e','p','o'};
       reverseString(s);
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }



    }
}
