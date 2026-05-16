public class QuickSort_java {
    public static void quickSort(int low,int high,int arr[])
    {
        if(low<high)
        {
            int pidx=partition(low,high,arr);
            quickSort(low,pidx-1,arr);
            quickSort(pidx+1,high,arr);
        }
    }
    public static int partition(int low,int high,int arr[])
    {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(pivot>arr[j]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[]={8,1,5,9,7,10,6};
        quickSort(0,arr.length-1,arr);
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}

