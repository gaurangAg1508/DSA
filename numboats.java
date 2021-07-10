
import java.util.Arrays;
class Solution {
public int numRescueBoats(int[] people, int limit) {
    int cntr=0;
    for(int i=0;i<people.length;i++){
        for(int j=i+1;j<people.length;j++){
            if(people[i]+people[j]==limit){
                cntr++;
                people = ArrayUtils.remove(people,j);
                break;
            }
        }
        cntr++;
    }
return cntr;
}
}