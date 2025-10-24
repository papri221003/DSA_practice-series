import java.util.*;
public class Max_Piece {
    public static int max_no_piece_Ncuts(int N)
    {
        int a=N/2;
        int b=N-a;
        int max_piece=(a+1)*(b+1);
        return max_piece;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(max_no_piece_Ncuts(N));

    }
}
