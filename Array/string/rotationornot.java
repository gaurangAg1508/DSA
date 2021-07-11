package Array.string;

public class rotationornot {
    public static void main(String[] args) {
        
    
    String s1="ABCDH";
    String s2="CDHAB";
     
    if(s1.length()!=s2.length()){
        System.out.println("not rotated strings");
    }
    else 
    {
        String temp=s1+s1;
        if(temp.indexOf(s2)!=-1){
            System.out.println("rotated strings");
        }
        else System.out.println(" not rotated strings");
    }
    
   
}}
