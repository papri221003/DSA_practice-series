public class Toggle_to_bin_dec_and_again {
    public static int toggle(int n)
    {

        int t=n;
        String bin="";
        while(t>0)
        {
            int rem=t%2;
            t=t/2;
            bin=bin+rem;   //to get it reverse order we do it as bin+rem ...if we need it in normal then rem+bin....
        }

        //now making it decimal
        int decimal=0;
        for(int i=0;i<bin.length();i++)
        {
            int bit=bin.charAt(i)-'0';
            decimal=(decimal*2)+bit;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int n=10;
        if(n<=100) {
            System.out.println(toggle(n));
        }
        else {
            System.out.println("WRONG INPUT!.....");
        }

    }
}
