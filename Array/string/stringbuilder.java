package Array.string;

public class stringbuilder {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder("gaurang");
        // System.out.println(sb.charAt(2));      // get function
        // sb.setCharAt(0,'d');                  //update
        // System.out.println(sb);
        // System.out.println(sb.length());           
        // sb.insert(4,'z');                    //insert
        // System.out.println(sb);
        // sb.deleteCharAt(4);               //delete
        // System.out.println(sb);
        // sb.append("hhh");                 // concratinate
        // System.out.println(sb);
        int j=1000000;
        StringBuilder s=new StringBuilder();
        long start=System.currentTimeMillis();
        for(int i=0;i<j;i++){
         s=s.append(i);
        }
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println(time);

    }
}
