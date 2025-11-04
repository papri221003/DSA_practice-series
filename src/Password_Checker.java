public class Password_Checker {
    public static boolean strongPasswordCheckerII(String password) {
        if(password.length()<8)
        {
            return false;
        }
        int uc=0;
        int lc=0;
        int sp=0;
        int dig=0;
        String special="!@#$%^&*()-+";

        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);
            if(i<password.length()-1 && ch==password.charAt(i+1))
            {
                return false;
            }

            if(ch>='a' && ch<='z')
            {
                lc++;
            }
            if(ch>='A' && ch<='Z')
            {
                uc++;
            }

            if(special.indexOf(ch)>=0)
            {
                sp++;
            }

            if(ch>='0' && ch<='9')
            {
                dig++;
            }
        }

        if(uc>0 && lc>0 && sp>0 && dig>0)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String password="yvTY#@IB#*!hjrQt-TLW&z)$@!%Duqt&ToskxHgnybqpndMI+wP&fcemIk#@KnkMTaUkcIbncpTL";
        System.out.println(strongPasswordCheckerII(password));
    }
}
