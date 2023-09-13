import java.util.*;
public class unionAndIntersection {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,6,2,4};

        //union 
        for(int i=0;i<arr1.length;i++){
           set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set.size());
        for (Integer sets : set) {
            System.out.println(sets);
        }

        //intersection
        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
                System.out.println(arr2[i]);
            }
        }
        System.out.println((count));
    }
}
