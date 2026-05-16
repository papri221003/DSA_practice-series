public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={7,8,5,4,1,9,7,10};
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
                if(min!=i)
                {
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }



}
