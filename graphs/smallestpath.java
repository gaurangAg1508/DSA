package graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;



public class smallestpath {
   static class Edge{
       int src;
       int nbr;
       int wth;
   Edge(int src,int nbr,int wth){
     this.src=src;
     this.nbr=nbr;
     this.wth=wth;
   }
    }
    static String smpath;
    static Integer smallpathwth=Integer.MAX_VALUE;
public static void main(String[] args) throws Exception {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int vrt=Integer.parseInt(br.readLine());
    ArrayList<Edge> [] graph=new ArrayList[vrt];
    for(int i=0;i<vrt;i++){
        graph[i]=new ArrayList<Edge>();
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
       smallpath(graph,src,des,visited,src+ "",0) ;
System.out.println(smpath);
System.out.println(smallpathwth);
     
}
public static void  smallpath (ArrayList<Edge>[] graph,int src,int des,boolean []visited,String ps,int spwth) {
    if(src==des){
        if(spwth<smallpathwth){
            smpath=ps;
            smallpathwth=spwth;
        }
    return;
    }
visited[src]=true;
for(Edge e: graph[src]){
    if(visited[e.nbr]==false){
       smallpath(graph, e.nbr, des, visited, ps+e.nbr, spwth+e.wth);
    }
}
visited[src]=false;
}
}
