import java.util.*;
public class primsAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wei;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wei=w;
        }
    }
    public static void Create(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //vertex 0
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        //vertex 1
        graph[1].add(new Edge(1,3,40));
        //vertex 2
        graph[2].add(new Edge(2,3,50));
    }
    static class pair implements Comparable<pair>{
        int v;
        int cost;
        public pair(int v,int c){
            this.v=v;
            this.cost=c;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void primsAlgo(ArrayList<Edge>[] graph,int src){
        boolean[] visit=new boolean[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue();
        pq.add(new pair(src, 0));
        int TotalCost=0;

        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!visit[curr.v]){
                visit[curr.v]=true;
                TotalCost+=curr.cost;
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new pair(e.dest, e.wei));
                }
            }
        }
        System.out.println(TotalCost);
    }
    public static void main(String args[]){
      ArrayList<Edge>[] graph=new ArrayList[4];
      Create(graph);
      primsAlgo(graph , 0);
    }
}
