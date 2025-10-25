import java.util.*;
public class Min_num_To_MoveSeats {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<students.length;i++)
        {
            sum+=Math.abs(students[i]-seats[i]);
        }
        return sum;

    }
    public static void main(String[] args) {
        int seats[]={4,1,5,9};
        int students[]={1,3,2,6};
        System.out.println(minMovesToSeat(seats,students));

    }
}
