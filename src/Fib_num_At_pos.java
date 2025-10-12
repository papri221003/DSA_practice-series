public class Fib_num_At_pos {
    public static int FibPos(int n)
    {
        if(n<2)
        {
            return n;
        }
        return FibPos(n-1)+FibPos(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FibPos(4));

    }
}
