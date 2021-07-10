package sorting;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={1,99,78,66,2,3,4,77,900,134,56};
      for(int i=0;i<arr.length-1;i++){
          int m=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]>arr[m]){
                  int temp=arr[j];
                  arr[j]=arr[m];
                  arr[m]=temp;
              }
          }
      }
      for(int i=0;i<arr.length-1;i++){
          System.out.println(arr[i]);
      }
    }
}
