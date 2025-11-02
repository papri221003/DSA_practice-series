import java.util.*;
public class Intersection_Typetwo {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else
            {
                map.put(nums1[i],1);
            }
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0)
            {
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }

        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums1[]={1,2,2,4};
        int nums2[]={2,2,4};
        int result[]=intersect(nums1,nums2);

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}
