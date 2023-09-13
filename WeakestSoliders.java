import java.util.*;
public class WeakestSoliders {
    static class point implements Comparable<point>{
        int soliders;
        int row;
        public point(int soliders,int row){
            this.soliders=soliders;
            this.row=row;
        }

        @Override
        public int compareTo(point r2){
            if(this.soliders==r2.soliders){
                return this.row-r2.row;
            }else{
                return this.soliders-r2.soliders;
            }
        }
    }
    public static void main(String args[]){
        int pnt[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
        int k=2;
        PriorityQueue <point> pq=new PriorityQueue<>();              
        for(int i=0;i<pnt.length;i++){
            int cost=0;
            for(int j=0;j<pnt[0].length;j++){
               if(pnt[i][j]==1){
                cost+=pnt[i][j]==1?1:0;
               }
            }
            pq.add(new point(cost,i));
        }  
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().row);
        }            
    }
}
