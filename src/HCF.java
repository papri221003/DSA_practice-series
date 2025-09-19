public class HCF {
    public static int determineHCF(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(determineHCF(15,75));

    }
}
