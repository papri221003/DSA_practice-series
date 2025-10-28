public class Number_Complement {
    public static int findComplement(int num) {
        int t=num;
        String bin="";
        while(t>0)
        {
            int rem=t%2;
            t=t/2;
            bin=rem+bin;
        }
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            {
                sb.append('0');
            }
            else
            {
                sb.append('1');
            }
        }

        int decimal=0;
        for(int i=0;i<sb.length();i++)
        {
            int bit=sb.charAt(i)-'0';
            decimal=(decimal*2)+bit;
        }

        return decimal;

    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
