package sorting;

public class insertionsort {
    public static void main(String[] args) {
        int arr[]={1,99,78,66,2,3,4,77,900,134,56};
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
    }
}}
