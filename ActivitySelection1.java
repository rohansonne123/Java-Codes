//if ending array is not sorted 
import java.util.*;
public class ActivitySelection1 {
    public static void main(String args[]){
     int start[]={1,3,0,5,8,5};
     int end[]={2,4,6,7,9,9}; 
     ArrayList<Integer> arr=new ArrayList<>(); 
     int count=0;
     int arrayselection[][]=new int[end.length][3];
     for(int i=0;i<arrayselection.length;i++){
        arrayselection[i][0]=i;
        arrayselection[i][1]=start[i];
        arrayselection[i][2]=end[i];
     } 
     Arrays.sort(arrayselection,Comparator.comparingDouble(o->2)); 
     count=1;
     arr.add(arrayselection[0][0]);
     int current=arrayselection[0][2];
     for(int i=1;i<end.length;i++){
        if(current<=arrayselection[i][1]){
            count++;
            arr.add(arrayselection[i][0]);
            current=arrayselection[i][2];
        }
     } 
     System.out.println(count);
     for(int i=0;i<arr.size();i++){
        System.out.println("A"+arr.get(i));
     }
     System.out.println();
    }
}
