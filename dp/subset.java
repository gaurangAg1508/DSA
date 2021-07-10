import javax.lang.model.util.ElementScanner6;

public class subset {
    public static void main(String[] args) {
    
    int subset[]={2,4,6,8};
 int sum=10;
  
     int matrix[][]=new int[subset.length+1][sum+1];
     for(int i=0;i<subset.length+1;i++){
         for(int j=0;j<sum+1;j++){
             if(i==0||j==0){
                 matrix[i][j]=0;
             }
             else if(j<subset[i-1]){
                 matrix[i][j]=0;
             }
             else if(j==subset[i-1]){
                 matrix[i][j]=1;
             }
             else {
                 if()
             }
         }
     }

 
    
}
