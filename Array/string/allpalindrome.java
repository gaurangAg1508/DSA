package Array.string;

public class allpalindrome {
    public static boolean ispalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abccbc";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(ispalindrome(sub)==true){
                    System.out.println(sub);
                }
            }
        }
    }
}
