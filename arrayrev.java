

public class arrayrev {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
           int Temp=arr[i];
           arr[i]=arr[j];
           arr[j]=Temp;

        }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
