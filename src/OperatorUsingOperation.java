public class OperatorUsingOperation {
    public static void main(String[] args) {
        int num1=13;
        int num2=7;
        int result=num1 & num2; //AND operation
        int result1=num1 | num2;//OR operation
        int result3=num1 ^ num2;// XOR operation
        int result4=num1>>2; //right shift by 2
        int result5=num1<<2; //left shift by 2
        int result6=~num1;
        System.out.println("AND "+result);
        System.out.println("OR "+result1);
        System.out.println("XOR "+result3);
        System.out.println("The right shifted number is: "+ result4);
        System.out.println("The left shifted number is: "+ result5);
        System.out.println("The NOT operation is "+ result6);
    }
}
