public class Max {
    public static int maximum(int a,int b)
    {
        if(a<b)
        {
           return maximum(b,a);
        }
        else {
            return a;
        }
    }
    public static void main(String[] args) {
        System.out.println(maximum(11,50));

    }
}
