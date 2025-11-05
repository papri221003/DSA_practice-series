public class Maximum_AVG_Subarray {
    public static double findMaxAverage(int[] nums, int k) {
        // Step 1: Find sum of first k elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Step 2: Use sliding window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Slide the window
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: Return maximum average
        return maxSum / k;
    }

    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}
