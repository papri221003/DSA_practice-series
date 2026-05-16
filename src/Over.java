public class Over {
    public static double calcArea(int a) {
        return 3.14 * a * a;
    }

    public static double calcArea(int a, int b) {
        return a * b;
    }
}

class main{
    public static void main(String[] args)
    {
        Over o=new Over();
        System.out.println(o.calcArea(2));

        System.out.println(o.calcArea(2,4));
    }
}
