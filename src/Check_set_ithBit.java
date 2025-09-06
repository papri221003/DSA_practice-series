public class Check_set_ithBit {
    public static boolean CheckIthBit(int num,int i)
    {
        int n=1<<i;
        if((num & n)!=0){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        int num=13;
        int i=2;
        boolean res=CheckIthBit(num,i);
        System.out.println(res);

    }
}
