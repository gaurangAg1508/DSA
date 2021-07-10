package dp;

class fib{
    public static int  fibbmemoized(int n,int qb[]) {
        if(n==0||n==1){
        return n;}
        if(qb[n]!=0){
            return qb[n];
        }
        int fib1=fibbmemoized(n-1,qb);
        int fib2=fibbmemoized(n-2,qb);
        int fibn=fib1+fib2;
        qb[n]=fibn;
        return fibn;
        
    }
    public static void main(String[] args) {
        int n=10;
        int []qb =new int[n+1];
        int fibn=fibbmemoized(n,qb);
        System.out.println(fibn);
        
    }
}