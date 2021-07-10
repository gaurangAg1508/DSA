package graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;







public class initialize {
static class Edge{
    int src;
    int nbr;
    int wgth;
Edge(int src,int nbr,int wgth){
    this.src=src;
    this.nbr=nbr;
    this.wgth=wgth;
}
public static void main(String[] args) throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int vrt=Integer.parseInt(br.readLine());
    ArrayList<Edge>[] graph=new ArrayList[vrt];
   for(int i=0;i<vrt;i++){
    graph[i]=new ArrayList<>();
   }
   int edges=Integer.parseInt(br.readLine());
   for(int j=0;j<edges;j++){
       String[] parts=br.readLine().split(" ");
       int src=Integer.parseInt(parts[0]);   
       int des=Integer.parseInt(parts[1]);
       int wgth= Integer.parseInt(parts[2]);
       graph[src].add(new Edge(src,des,wgth));
       graph[des].add(new Edge(des,src,wgth));
   }
      int src=Integer.parseInt(br.readLine());
      int des=Integer.parseInt(br.readLine());
       boolean[] visited=new boolean[vrt];
       printallpaths(graph,src,des,visited,src+ "") ;
   }
   public static boolean printallpaths(ArrayList<Edge>[]graph,int src,int des,boolean[] visited,String ps ) {
       if(src==des){
        System.out.println(ps);  
        return true;
       }
       visited[src]=true;
       for(Edge edge:graph[src]){
           if(visited[edge.nbr]==false){
            printallpaths(graph,edge.nbr,des,visited,ps) ;
            
             }
           }
       
       visited[src]=false;
       
   }

}
}








