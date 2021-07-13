package Array.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class validshuffleoftwo {
    public static void main(String[] args) {
        String s1="YX";
        String s2 ="12";
        String s3="1XY2";
        char[] s3ch=s3.toCharArray();
        Arrays.sort(s3ch);
        s3=String.valueOf(s3ch);
    if(s3.indexOf(s1)!=-1 && s3.indexOf(s2)!=-1){
         System.out.println("valid shuffle");
    }
    else  System.out.println(" not valid shuffle");
    }
}
