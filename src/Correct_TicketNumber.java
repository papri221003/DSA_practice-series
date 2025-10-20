public class Correct_TicketNumber {
    public static String Correct_TicketNumber(String str)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i<=str.length()-2 && str.charAt(i)=='E' && str.charAt(i+1)=='F')
            {
                i=i+1;
                continue;
            }
            if(i<=str.length()-2 && str.charAt(i)=='5' && str.charAt(i+1)=='6')
            {
                i=i+1;
                continue;
            }
            if(str.charAt(i)=='G')
            {
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="56EFG1256";
        System.out.println(Correct_TicketNumber(str));

    }
}
