class stack{
    int top=-1;
    int arr[]=null;
  stack(){
      this.arr=new int[10];
  }  
  stack(int size){
      this.arr=new int[size];

  }
  public void push(int data){
      if(this.arr.length-1==this.top){
        System.out.println("stack overflow");
      }
      else{
          this.top=this.top+1;
          this.arr[this.top]=data;

      }

  }
  public void pop(){
      if(this.top==-1){
      System.out.println("stack underflow");}
      else{
          this.top=this.top-1;

      }
  }
  int topele(){
      if(this.top>-1){
          return(this.arr[this.top]);

      }
      else{
        try{
            throw(new Exception("Empty stack"));
        }
        catch(Exception e){
          System.out.println(e);
        }
      }
      return -1;
      }
     public boolean Empty(){
         if(this.top==-1){
             return true;
         }
         else return false;
     }
      
    }
    public class stackarr{
        public static void main(String args[]){
            stack st= new stack(5);
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
            System.out.println(st.topele());
            st.pop();
            System.out.println(st.topele());
        }
        
    }

    



