import java.util.Scanner;

public class Matrix_Search {
    public static void create(int row,int col,int numbers[][]){
        Scanner sc=new Scanner(System.in);
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

    public static void search(int row,int col,int numbers[][],int x)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.println("The element is in : "+i+","+j);
                    return;
                }
            }
        }
        System.out.println("ITEM NOT FOUND!!!!.....");
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Enter the size of the column: ");
        int col=sc.nextInt();
        int numbers[][]=new int[row][col];
        create(row,col,numbers);

        System.out.println("Enter the number to be searched: ");
        int x=sc.nextInt();
        search(row,col,numbers,x);


    }
}
