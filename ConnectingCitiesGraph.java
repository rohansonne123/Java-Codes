import java.util.*;
public class ConnectingCitiesGraph {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        public Edge(int d,int c){
            this.dest=d;
            this.cost=c;
        }

        @Override
        public int compareTo(Edge c2){
            return this.cost-c2.cost;
        }
    }
    public static int ConnectingCities(int cities[][]){
        PriorityQueue<Edge> pq=new PriorityQueue<>();
        boolean visit[]=new boolean[cities.length];
        pq.add(new Edge(0,0));
        
        int MinCost=0;
        while(!pq.isEmpty()){
            Edge curr=pq.remove();
            if(!visit[curr.dest]){
                visit[curr.dest]=true;
                MinCost+=curr.cost;
                for(int i=0;i<cities[curr.dest].length;i++){
                    if(cities[curr.dest][i]!=0){
                       pq.add(new Edge(i,cities[curr.dest][i]));
                    }
                }
            }


        }
        System.out.println(MinCost);
        return MinCost;
    }
   public static void main(String args[]){
    int cities[][]={{0,1,2,3,4},
                    {1,0,5,0,7},
                    {2,5,0,6,0},
                    {3,0,6,0,0},
                    {4,7,0,0,0}
                  };
        System.out.println(ConnectingCities(cities));
   }
}
