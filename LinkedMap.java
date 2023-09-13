import java.util.*;
public class LinkedMap {
    public static void main(String args[]){
        LinkedHashMap<Integer,Integer> lm=new LinkedHashMap();
        lm.put(1,22);
        lm.put(2,32);
        lm.put(4,13);
        lm.remove(1);
        lm.containsKey(2);
        Set<Integer> keys=lm.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
    }
}
