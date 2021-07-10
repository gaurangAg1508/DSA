import java.security.Key;

import org.graalvm.compiler.graph.Node;

import jdk.javadoc.internal.doclets.formats.html.markup.Head;

class Node{
int data;
Node next;

Node(int data){
    this.data=data;
    this.next=null;
}
}
class linkedlist{
    public static Node insertll(int data,Node head){
        Node temp=new Node(data);
        if(head==null){
        head=temp;
        return head;
        }
        else{
         
        }
        
        return head;
    }
    public static void print(Node head){
        if(head==null){
            return;
        }
        else {
            while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }}
    public static void printrec(Node head) {
        if(head==null){
            return;}
         else{
            System.out.println(head.data+" ");
            printrec(head.next);

         }
         return;}
         public static  void doubledata(Node head) {
            if(head==null){
                return;}
                else{
                    
                    head.data=2*head.data;
                    doubledata(head.next);

                    }
                }
          public static void swapdata(Node head) {
            if(head==null){
                return;}
              else{
                  int temp=head.data;
                  head.data=head.next.data;
                  head.next.data=temp;
                  head=head.next.next;
                  swapdata(head);

          }}
             
         public static Node Swapnode(Node head) {
            Node root=head;
            if(head.next!=null){
                root=head.next;
            }
            Node prev=null;
            while( head!=null && head.next!=null  ){
                 Node tempp=head.next;
                 head.next=tempp.next;
                 tempp.next=head;
                 if(prev==null){
                     prev=head;
                 }
                 else{
                     prev.next=tempp;
                     prev=head;
                 }
                 head=head.next;

                }
                return root;
            }
         }
        public static Node insertatstart(int data,Node head) {
                Node temp=new Node(data);
            if(head==null){
                head=temp;
            return head;}
        else{
            temp.next=head;
            head=temp;
        }
        return head;
    
        }
         public static int search(int key,Node head) {
            int index=-1;
            while(head!=null){
                index++;
                if(key==head.data)
                 return index;
                  head=head.next;
            
                }
             return -1;
         }
        
        static int  kthfromend(int k,Node head)
       {  Node fisrt,secound=null;
          fisrt=head;
        while(k>-1){
            k--;
             fisrt=fisrt.next;
        }
        if(k==1){
        secound=head;
        while(fisrt.next!=null){
            fisrt=fisrt.next;
            secound=secound.next;
        }
        return secound.data;
    }
    return -1;
    }

    }
