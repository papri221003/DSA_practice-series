public class Find_Duplicates {
    public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        while(true)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast)
                break;
        }//Detects the cycle exists ort not
        //find the starting of the cycle
        slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,5,2};
        System.out.println(findDuplicate(nums));
    }
}
