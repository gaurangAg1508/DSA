package sorting;

public class sortzo {
    public static void sort(int arr[],int low,int high) {
        int i=low;
        int j=low;
        while(i<arr.length){
            if(arr[i]>0){
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
        for(int y:arr){
            System.out.println(y);

        }
        }
        public static void main(String[] args) {
            int arr[]={0,0,0,0,1,1,0,1,0,1,0,0,1,1,1};
            sort(arr, 0, 1);
        }
        
    }
 
