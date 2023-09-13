import java.util.*;
public class Hashmap {
    public static void main(String args[]){
      HashMap<String,Integer> hm=new HashMap<>();
      //inserting elements - O(1)
      hm.put("india",150);
      hm.put("china",100);
      hm.put("butan",50);

      System.out.println(hm);  //unordered sequence

      //getting the value at a particular key O(1)
      System.out.println(hm.get("india"));
      System.out.println(hm.get("pakistan"));

      //containsKey  O(1)
      System.out.println(hm.containsKey("india"));
      System.out.println(hm.containsKey("indonatia"));

      //remove()   O(1)
      System.out.println(hm.remove("india"));
      System.out.println(hm);
      System.out.println(hm.size());

      //clear  
    //   hm.clear();
    //   System.out.println(hm);
    //   System.out.println(hm.isEmpty());

    //itteration on hashmap 
    Set<String> keys=hm.keySet();
    System.out.println(keys);

    for (String k : keys) {
        System.out.println("key="+k +", value="+ hm.get(k));
    }
      
    }
}
