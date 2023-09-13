import java.util.*;
public class CheapestFliteWithKstopsGraph {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
           this.src=s;
           this.dest=d;
           this.wt=w;
        }
    } 
    static class Info{
        int v;
        int cost;
        int k; //no of vertex come between

        public Info(int v,int c,int k){
            this.v=v;
            this.cost=c;
            this.k=k;
        }
    }
    public static void Create(int flights[][],ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wei=flights[i][2];

            Edge e=new Edge(src, dest, wei);
            graph[src].add(e);
        }
    }
    public static int CheapestFlights(int flights[][],int sr,int dst,int k,int v){
        ArrayList<Edge>[] graph=new ArrayList[v];
        Create(flights, graph);
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=sr){
              dist[i]=Integer.MAX_VALUE;
            }
        }
        
        Queue<Info> q=new LinkedList<>();
        q.add(new Info(sr, 0, 0));

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(k<curr.k){
                break;
            }

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);
               // int src=e.src;
                int dest=e.dest;
                int wt=e.wt;
                if(curr.cost+wt<dist[dest]&&curr.k<=k){
                   dist[dest]=curr.cost+wt;
                   q.add(new Info(dest,dist[dest],curr.k+1));
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dst];
        }
        }
    public static void main(String args){
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0;
        int dest=3;
        int k=1;
        
        System.out.println(CheapestFlights(flights, src, dest, k, 4));
    }
}
