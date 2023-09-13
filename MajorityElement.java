import java.util.*;
public class MajorityElement {
    public static void main(String args[]){
        int nums[]={1,2,3,1,4,6,1,5,7};
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(hm.containsKey(key)){
               hm.put(key,hm.get(key)+1);
            }else{
                hm.put(key,1);
            }
        } 
        Set<Integer> key=hm.keySet();
        for (Integer keys : key) {
            if(hm.get(keys)>=(nums.length/3)){
                System.out.println(keys);
            }
        }
    }
}
