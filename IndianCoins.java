import java.util.Comparator;
import java.util.*;

public class IndianCoins {
    public static void main(String args[]){
        Integer arr[]={1,2,5,10,20,50,100,200,500,2000}; 
        //sorting the given array in desending order first 
        Arrays.sort(arr,Comparator.reverseOrder()); 
        int count=0;
        int val=121; 
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(val>=arr[i]){ 
                while(val>=arr[i]){
              val-=arr[i]; 
              al.add(arr[i]);
              count++;
            }
        }
        } 
        System.out.println("the no of coins?notes used are :"+count); 

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
