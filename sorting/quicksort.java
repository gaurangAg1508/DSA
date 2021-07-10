package sorting;

public class quicksort {
    public static int partition(int arr[],int pivot,int low,int high) {
        int i=low,j=low;
        while(i<=high){
            if(arr[i]>pivot){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
        return j-1;
    }
    public static void quicksortt(int arr[],int low,int high) {
        if(low>=high){
            return;
        }
       int pivot=arr[high];
       int pi=partition(arr, pivot, low, high);
       quicksortt(arr, low, pi-1);
       quicksortt(arr, pi+1, high);
      
        
    }
    public static void main(String[] args) {
        int arr[]={5,5,2,4,1,3};
        quicksortt(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
