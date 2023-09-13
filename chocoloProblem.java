import java.util.Collection;
import java.util.*;
public class chocoloProblem {
    public static void main(String args[]){
        int n=3;
        int m=3;
        Integer arr1[]={3,5};
       Integer arr2[]={4,2}; 
    // Integer arr1[]={2,1,3,1,4};
    // Integer arr2[]={4,1,2};
        Arrays.sort(arr1,Collections.reverseOrder());
        Arrays.sort(arr2,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1; 
        int count=0;
        while(v<arr1.length&&h<arr2.length){
             if(arr1[v]>=arr2[h]){
                count+=(arr1[v]*hp);
                vp++; 
                v++;
             }else{
                count+=(arr2[h]*vp);
                hp++;
                h++;
             }
        } 
        while(v<arr1.length){
            count+=(arr1[v]*hp);
            vp++; 
            v++;
        } 
        while(h<arr2.length){
            count+=(arr2[h]*vp);
            hp++;
            h++;
        }
        System.out.println("the minimum cost for smallest part of chocalate is "+ count);
    }
}
