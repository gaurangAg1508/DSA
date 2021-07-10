1public class leader {
    public static void main(String[] args) {
        int array[]={2,16,3,4,7,5,4,3};
        boolean flag=false;
        for(int i=0;i<array.length-1;i++){
            flag=true;
            for(int j=i+1;j<array.length-1;j++){
            if(array[i]<array[j])
            flag=false;}
            if(flag==true)
            System.out.print(array[i]);
        }
    System.out.println();
        int max=array[array.length-1];
     System.out.print(max+" ");
     for(int i=array.length-2;i>=0;i--){
         if(array[i]>max){
         System.out.print(array[i]+" ");
        max=array[i];}
    
     } 
 
 
 
    }
}
