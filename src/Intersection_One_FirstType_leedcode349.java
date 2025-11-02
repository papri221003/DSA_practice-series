import java.util.*;
public class Intersection_One_FirstType_leedcode349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }
        int arr[]=new int[set2.size()];
        int i=0;
        Iterator<Integer>it=set2.iterator();
        while(it.hasNext())
        {
            arr[i]=it.next();
            i++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,2,4};
        int nums2[]={2,2,4};

        int result[]=intersection(nums1,nums2);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
