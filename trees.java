import java.util.*;
class Node{
    int data;
    Node left ;
    Node right;


Node(int data){
this.data=data;
this.left=null;
this.right=null;
}}
public class trees{
public static Node insertbst( Node root,int data){
    if(root==null){
         Node temp=new Node(data);
        root=temp;
    }
    if(data<root.data){
        root.left=insertbst(root.left,data);
    }
    else {
        root.right=insertbst(root.right,data);
    }
    return root;
}
public static void inorderbst(Node root,int data){
    if(root==null){
        return;
    }
    else{
        inorderbst(root.left,data);
        System.out.println(" "+root.data);
        inorderbst(root.right,data);

    }

}
public static void main(String[]args){
Node root;
Node n1=new Node(20);
root=n1;
n1=new Node(16);
root.left=n1;
n1=new Node(21);
 root.right=n1;
insertbst(root,100);
insertbst(root,110);
insertbst(root,0);insertbst(root,4);insertbst(root,70);insertbst(root,15);
}


}