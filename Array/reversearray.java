package Array;

public class reversearray {
    public static void main(String[] args) {
        String s="gaurang";
        char[] str=s.toCharArray();
        {if(str.length==0){
           System.out.println(String.valueOf(str));
        }else if(str.length==1){
            System.out.println(String.valueOf(str));
        }else{
            int i;
        int j=str.length-1;
        
            for(i=0;i<j;i++){
                char temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                j--;
            }
          
            System.out.println(String.valueOf(str));
    }}}}

