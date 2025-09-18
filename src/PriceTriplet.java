/*The cost of a stock on each day is given in an array, arr. An investor wants to buy the stocks in triplets such that the sum of the cost for three days is divisible by d.

The goal is to find the number of distinct triplets (i, j, k) such that i < j < k and the sum
(arr[i] + arr[j] + arr[k]) is divisible by d.*/




public class PriceTriplet {
    public static int countDivisibleTriplets(int arr[],int d)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if((arr[i]+arr[j]+arr[k])%d==0)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int arr[]={3,3,4,7,8};
        int d=5;
        System.out.println(countDivisibleTriplets(arr,d));

    }
}
