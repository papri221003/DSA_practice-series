public class Sum_Of_Cube {
    public static void main(String[] args) {
        int m=4;
        int n=9;
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            sum+=(i*i*i);
        }
        System.out.println(sum);
    }
}
