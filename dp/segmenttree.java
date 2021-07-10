package dp;



public class segmenttree {
  static  int tree[]=new int [100000];
public static void buildtree(int arr[],int s,int e,int index){

   if(s==e){
       tree[index]=arr[s];
       return;
   }
   int mid=s+(e-s)/2;
   buildtree(arr, s, mid, 2*index+1);
   buildtree(arr, mid+1, e,2*index+2);
   tree[index]=tree[2*index+1]+tree[2*index+2];
}
public static int   rangesum(,int ss,int se,int qs,int qe,int index) {
    if(qe<ss ||qs>se){
        return 0;
    }
    if(qe>se&&qs<ss){
        return tree[index];
    }
    int mid=ss+(se-ss)/2;
    return rangesum( ss, mid, qs, qe, 2*index+1)+rangesum(mid+1, se, qs, qe, 2*index+2);
    
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    rangesum(arr, 0, 4, 2, 4, 0);
}
}

