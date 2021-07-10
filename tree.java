
import java.util.*;
class Node{
    int data;
    Node left=null;
    Node right=null;

Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
}}
public  class tree{
public static Node insertbsd(Node root,int data){
if(root==null){
    Node temp=new Node(data);
    root=temp;
}
if(data<root.data)
{
    root.left=insertbsd(root.left,data);
}
else if (data>root.data){
    root.right=insertbsd(root.right, data);
}
return root;
}
public static void inorder(Node root){
    if(root==null){
        return;

    }
    else {
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }}
public static void main(String[] args) {
    Node root;
    Node n1= new Node(20);
    root=n1;
    n1=new Node(16);
    root.left=n1;
    n1=new Node(21);
    root.right=n1;
    
    root.left.left=new Node(5);
    root.left.right=new Node(18);

    //root.right.left=new Node(22);
    root.right.right=new Node(22);
    insertbsd(root, 19);
    inorder(root);

}}



