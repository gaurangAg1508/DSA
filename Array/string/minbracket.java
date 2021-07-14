package Array.string;

import java.util.Stack;

public class minbracket {
 public static void main(String[] args) {
    String s="}{{}}{{{"; 
    if(s.length()%2!=0){
       System.out.println(" can happen");;
    }else{
    Stack<Character>stack=new Stack<>();
    int cop=0;
     int ccls=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='{'){
            stack.push(s.charAt(i));
            cop++;

        }
        else if((s.charAt(i)=='}')&& (stack.peek()=='{')&&(stack.size()!=0)){
             stack.pop();
             cop--;
        }
        else{
            ccls++;
        }
    }
    if(ccls%2==0){
        ccls=ccls/2;
    }
    else{
        ccls=ccls/2+1;
    }
    if(cop%2==0){
        cop=cop/2;
    }
    else{
        cop=cop/2+1;
    }
    System.out.println(cop+ccls);}
 }   
}
