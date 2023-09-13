import java.util.*;
public class HashSet1 {
    public static void main(String args[]){
       HashSet<Integer> set=new HashSet<>();

       set.add(1);
       set.add(4);
       set.add(3);
       set.add(2);
       set.add(4);
       set.add(5);
       set.add(6);

       System.out.println(set);
       
     //LinkedHashSet

       LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
       lhs.add(1);
       lhs.add(4);
       lhs.add(3);
       lhs.add(2);
       lhs.add(4);
       lhs.add(5);
       lhs.add(6);

       System.out.println(lhs); 

       //TreeSet 

       TreeSet<Integer> ts=new TreeSet<>();
       ts.add(1);
       ts.add(4);
       ts.add(3);
       ts.add(2);
       ts.add(4);
       ts.add(5);
       ts.add(6); 

       System.out.println(ts);

       if(set.contains(2)){
        System.out.println("set contains 2");
       }

       if(set.contains(3)){
         System.out.println("set contains 3");
       } 
       if(set.isEmpty()){
        System.out.println("set is empty");
       } 

       //iteration using iterator

       Iterator it=set.iterator();

       while(it.hasNext()){
        System.out.println(it.next());
       }

       //iteration using foreach loop or advanced for loop

       for(Integer sets:set){
        System.out.println(sets);
       }
    }
}
