public class zigzagarr {
    public static void main(String[] args) {
        int array[]={2,5,7,8,94,4,2,3,465};
        int flag=0;
        for(int i=0;i<array.length-1;i++){
            if(flag==0){
                if(array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;

                }
                flag=1;
           
            }
        else {
        if(array[i]<array[i+1]){
            int temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;

        }
    flag=0;   
    }}
for(int i=0;i<array.length;i++){
    System.out.print(array[i]+"  ");
}    
}
}
