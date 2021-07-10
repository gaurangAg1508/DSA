package dp.hashmap;

import java.util.HashMap;

import javax.naming.ldap.HasControls;



public class getcomele {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,5,6,7,8};
        int arr2[]={1,2,3,44,5,6};
        HashMap<Integer,Boolean> hm =new HashMap<>();
       int maxs=0;
       int maxl=0;
        for(int var:arr1){
            hm.put(var,true);
        }
        for(int var:arr1){
            if(hm.containsKey(var-1)){
                hm.put(var,false);
            }
        }
        for(int var:arr1){
            if(hm.containsKey(var)==true){
                int tems=var;
                int teml=1;
                while(hm.containsKey(tems+teml))
                teml++;

                if(teml>maxl){
                    maxl=teml;
                    maxs=tems;
            }
            

            }

        } 

    }
    }
    

