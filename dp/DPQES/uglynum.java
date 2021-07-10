package dp.DPQES;

public class uglynum {
//     public static int  maxdiv(int n,int div) {
//         while(n%div==0){
//             n=n/div;
//         }
//         return n;
//     }
//     public static int  isugly(int i) {
//         i=maxdiv(i,2);
//         i=maxdiv(i,3);
//         i=maxdiv(i,5);
//         if(i==1){
//             return 1;
//         }
//         else return 0;
//     }
//     public static void  cntugly(int n) {
//         int cntr=1;
//         int i=1;
//         while(cntr<n){
//             i++;
//            if( isugly(i)==1){
//              cntr++;
             
//            }
           
//     }
// System.out.println(i);
// }
//     public static void main(String[] args) {
//         int n=8;
//         cntugly(n);
//     }

public static void main(String[] args) {
   
    int n=8;
    int dp[]=new int [n+1];
    dp[1]=1;
    int p2=1;
    int p3=1;
    int p5=1;
    for(int j=2;j<=n;j++){
        int f2=2*dp[p2];
        int f3=3*dp[p3];
        int f5=5*dp[p5];
        int min=Math.min(f2,Math.min(f3, f5));
      dp[j]=min;
      if(min==dp[p2])
        p2++;
      if(min==dp[p3])
        p3++;
      if(min==dp[p5])
        p5++;

  

    }
System.out.println(dp[n]);
}







}
