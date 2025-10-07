public class Even_Digits {
     public static int findNumbers(int[] nums) {
         int count = 0;
         for (int i = 0; i < nums.length; i++)
         {
             int no=nums[i];
             int len=0;
             while(no>0)
             {
                no=no/10;
                len++;
             }
             if(len%2==0) {
                count++;
             }
         }
         return count;
     }

    public static void main(String[] args) {
        int arr[]={12,345,2,6,7896};
        System.out.println(findNumbers(arr));

    }
}