public class Operations {
    public static String Conversion(int num)
    {
        String res="";
        if(num==0)
        {
            res=0+res;
            return res;
        }
        while(num!=0)
        {
            if(num%2==1)
            {
                res=1+res;
            }
            else {
                res=0+res;
            }
            num=num/2;
        }
        return res;
    }
    public static String AndOperation(String num1,String num2)
    {
        if(num1.length()<num2.length())
        {
            num1=0+num1;
        }
        if(num1.length()>num2.length())
        {
            num2=0+num2;
        }
        String result="";
        for(int i=num1.length()-1;i>=0;i--)
        {
            if(num1.charAt(i)=='1' && num2.charAt(i)=='1')
            {
                result=1+result;
            }
            else
                result=0+result;
        }
        return result;
    }

    public static void main(String[] args) {
        String num1=Conversion(13);
        String num2=Conversion(7);
        System.out.println("The result after AND operation is: "+AndOperation(num1,num2));

    }
}
