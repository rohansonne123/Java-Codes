import java.util.Comparator;
import java.util.*;
public class Knapsacks {
    public static void main(String args[]){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        } 
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int currweight=w; 
        int finalval=0;
        for(int i=ratio.length-1;i>=0;i--){ 
            int idx=(int)ratio[i][0];
            if(currweight>=weight[idx

            
    ]){
                currweight-=weight[idx];
                finalval+=value[idx];
            }else{
                finalval+=(ratio[i][1]*currweight);
                currweight=0;
                break;
            }
        } 
        System.out.println("the total val is :"+finalval);
    }
}
