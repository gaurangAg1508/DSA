public class zero_one_two {
    
    public static void main(String[] args) {
        int arr[]={0,1,2,0,2,0,1};
        int i=0;
        int j=arr.length/2;
        int k=arr.length-1;
        while(i<j&& j<k){
            if(i==0){
                i++;
            }
            
           else if(k==2){
                k--;
            }
            else if(j==1){
                j--;
            }
            else if(i==1&&j==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
           
            }
            else if(i==2&&k==0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                i++;
                k--;
            }
           else  if(j==2&&k==1){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                i++;
                k--;
            }
        }
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        } 
    }
}
