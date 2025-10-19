public class Product_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int product=1;
        int zerocount=0;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zerocount++;
                continue;
            }
            else
            {
                product*=nums[i];
            }
        }
        if(zerocount>1)
        {
            int i=0;
            while(i<result.length)
            {
                result[i]=0;
                i++;
            }
        }
        if(zerocount==1)
        {
            int i=0;
            while(i<result.length)
            {
                if(nums[i]==0)
                {
                    result[i]=product;
                }
                else
                {
                    result[i]=0;
                }
                i++;
            }
        }
        if(zerocount<1)
        {
            for(int i=0;i<nums.length;i++)
            {
                result[i]=product/nums[i];
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int num1[]={ 1,2,3,4};
        int num2[]={-1,1,3,0,5,2,-1};
        int result[]=productExceptSelf(num1);
        int result2[]=productExceptSelf(num2);
        System.out.print("[ ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        System.out.println("]");

        System.out.print("[ ");
        for(int i=0;i<result2.length;i++)
        {
            System.out.print(result2[i]+" ");
        }
        System.out.println("]");



    }
}
