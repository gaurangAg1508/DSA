public class one_zero {

    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
            
        } 
        System.out.println(); 
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
        if(arr[j]==1){
            j--;
        }
       
    }
  for(int k=0;k<arr.length;k++){
      System.out.print(arr[k]+" ");
  }      
}
    }

