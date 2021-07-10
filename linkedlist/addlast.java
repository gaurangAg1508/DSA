package linkedlist;

import java.nio.file.FileStore;

import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.nodes.StateSplit;

 class Node{
        int data;
        Node next;
    
    Node(int x){
this.data=x;
this.next=null;
    }
}
public class addlast {
public static Node linkedlist(int x,Node head) {
    Node temp=new Node(x);
    
    if(head==null){
        head=temp;
    }
    else{  Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=temp;
    }
    return head;
    
}
public static Node addlast(int x,Node head) {
    Node temp=new Node(x);
    if(head==null){
        head=temp;
    }
    else{  Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=temp;
    }
    return head;

    
}
public static void printll(Node head){
    if(head==null){
        return;
    }
    else {
        System.out.println(head.data);
        printll(head.next);
    }
}
public static void doubledata(Node head){
  if(head==null){
      return ;

  }
  else {Node current=head;
      while(current!=null){
          current.data=2*current.data;
          current=current.next;
      }
  }

}
public static  void Swapnode(Node head){
    if(head==null){
        return ;
  
}
while(head!=null&& head.next!=null){
    int temp=head.data;
    head.data=head.next.data;
    head.next.data=temp;
   head=head.next.next;

}
}
public static void kthfromend(int k , Node head){
    if(head==null)
    return;
    Node first,secound;
    first=head;
    while(k>0 && head!=null){
       first=first.next;
       k--;
    }
    secound=first;
    while(first.next!=null){
    
    }
}
public static void reversell(Node head) {
    Node prev=null;
    Node current=head;
    while(current!=null){
        Node next=current.next;
        current.next=prev;
        prev=current;
        current=next;

    }
    
}


}