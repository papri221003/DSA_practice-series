
import java.util.*;
public class Matrix {

    public static void create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("enter the size of the column: ");
        int col=sc.nextInt();
        int numbers[][]=new int[row][col];
        System.out.println("Take the input of the matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix show: ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        create();

    }
}
