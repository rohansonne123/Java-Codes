//prims algorithm
import java.util.*;
public class PrimsAlgo {
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
    public static void Create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //vertex 0
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,20));
        //vertex 1
        graph[1].add(new Edge(1,3,40));
        graph[1].add(new Edge(2,3,50));
    }
    static class pair implements Comparable<pair>{
        int ver;
        int cost;
        public pair(int v,int c){
            this.ver=v;
            this.cost=c;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void PrimsAlgo(ArrayList<Edge> graph[],boolean visit[]){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int TotalCost=0;
        pq.add(new pair(0,0));
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!visit[curr.ver]){
                TotalCost+=curr.cost;
                visit[curr.ver]=true;
                for(int i=0;i<graph[curr.ver].size();i++){
                    Edge e=graph[curr.ver].get(i);
                    pq.add(new pair(e.dest,e.wt));
                }
            }
        }
        System.out.println("Total minimum cost of given directed graph is:"+ TotalCost);
    }
    public static void main(String args[]){
     int v=4;
     ArrayList<Edge> graph[]=new ArrayList[v];
     Create(graph);
     boolean visit[]=new boolean[v];
     PrimsAlgo(graph, visit);
    }
}
