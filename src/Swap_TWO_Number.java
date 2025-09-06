public class Swap_TWO_Number {
    public static void main(String[] args) {
        int a=13;
        int b=12;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("First number is: "+a);
        System.out.println("Second number is: "+b);
    }
}
