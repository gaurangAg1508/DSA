package dp.hashmap;

import java.util.HashMap;
import java.util.Set;

public class getstart {
public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("india", 120);
    hm.put("usa",130);
    hm.put("china", 200);
    hm.put("australia",75);
    System.out.println(hm);
    System.out.println(hm.get("india"));
    System.out.println(hm.get("newyoyrk"));
    System.out.println(hm.containsKey("india"));
    System.out.println(hm.containsKey("hello"));
    Set<String> keys=hm.keySet();
    for(String key:keys){
        int val=hm.get(key);
        System.out.println(key+"  "+val);
    }
        
     
}
}
