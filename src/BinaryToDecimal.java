public class BinaryToDecimal {
    public static int conversion(String num)
    {
        int result=0;
        int p2=1;
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)=='1')
            {
                result=result+p2;
            }
            p2=p2*2;
        }
        return result;
    }
    public static void main(String[] args) {
        String num="111";
       int number= conversion(num);
        System.out.println("The numbe after conversion is: "+number);

    }
}
