package sorting;

public class mergesort {
    public static int[] mergetwosortedarray (int arr1[],int arr2[]) {
       int farray[]=new int[arr1.length+arr2.length];
       int i=0,j=0,k=0;
       while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
         farray[k]=arr1[i];
         i++;
         k++;
        }
        else{
            farray[k]=arr2[j];
            j++;
            k++;
        }}
        while(arr1.length>i){
            farray[k]=arr1[i];
        }
        while(arr2.length>j){
            farray[k]=arr1[j];
        }
        return farray;

       }
    public static int[] mergesortt(int arr[],int low, int high) {
    if(low==high){
        int arr2[]=new int[1];
        arr2[0] =arr[low];
        return arr2;
    }    
    int mid=(low+high)/2;
    int fsh[]=mergesortt(arr, low, mid);
    int ssh[]=mergesortt(arr, mid+1, high);
    return mergetwosortedarray(fsh,ssh);
    }
    public static void main(String[] args) {
        int arr[]={1,99,78,66,2,3,4,77,900,134,56};
        int high=arr.length-1;
        arr=mergesortt(arr, 0, high);
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
        
    }
}
