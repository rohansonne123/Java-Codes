import java.util.*;
public class ActivitySelection {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int count=1;
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(0);
        int current=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=current){
                current=end[i];
                count++;
                arr.add(i);
            }
        } 
        System.out.println(count);
        for(int i=0;i<arr.size();i++){
            System.out.println("A"+arr.get(i));
        }
        System.out.println();
    }
}
