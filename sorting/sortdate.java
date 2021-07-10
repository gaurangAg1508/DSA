package sorting;

public class sortdate {
    public static void sortdatte(String arr[]) {
        
        countsort(arr,32,1000000,100);
        countsort(arr,13,10000,100);
        countsort(arr,2501,1,10000);
    }
    public static void countsort(String arr[],int range,int div,int mod){
      int farr[]=new int[range];
      for(int i=0;i<arr.length;i++){
        farr[Integer.parseInt(arr[i],10)/div%mod]++;
      }
      for(int i=1;i<farr.length;i++){
        farr[i]+=farr[i-1];
      }
      String ans[]=new String[arr.length];
      for(int i=arr.length-1;i>=0;i--){
          int val=Integer.parseInt(arr[i],10)/div%mod;
          int pos=farr[val];
          int indx=pos-1;
          ans[indx]=arr[i];
          farr[Integer.parseInt(arr[i],10)/div%mod]--;


      }
      for(int i=0;i<ans.length;i++){
         arr[i]=ans[i];
      }
    } 
    public static void main(String[] args) {
        String arr[]={"12041996","20101996","05061997","12041989"};
        sortdatte(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
