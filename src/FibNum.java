//Fibonnacci Series
public class FibNum {
    public static void FibNum(int num1,int num2,int count)
    {
        count++;
        if(count == 7)
        {
            return;
        }
        int num3=num1+num2;
        System.out.print(num3+" ");
        num1=num2;
        num2=num3;
        FibNum(num1,num2,count);
    }
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        System.out.print(num1+" "+num2+" ");
        int count=2;
        FibNum(num1,num2,count);

    }
}
