import java.util.ArrayList;
import java.util.Scanner;

public class Ques19_Age_Greater_Than_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); //no of students
        int totalfemale=0;
        int totalgrade=0;

        ArrayList<String>list=new ArrayList<>();

        for(int i=0;i<N;i++)
        {
            String name=sc.next();
            int age=sc.nextInt();
            char grade=sc.next().charAt(0); //taking user input as character
            String gender=sc.next();

            if(age>20)
            {
                list.add(name);
            }

            if(gender.equals("Female"))
            {
                totalfemale++;
                totalgrade=totalgrade+(int)grade;
            }
        }

        for(int i=0;i< list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        if(totalfemale>0) {
            int avg = totalgrade / totalfemale;
            System.out.println(avg);
        }
    }
}
