public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            //area=length*width
            int area=Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(area,maxArea);

            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
}
