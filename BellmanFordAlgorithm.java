import java.util.*;
public class BellmanFordAlgorithm {
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
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        //vertex 1
        graph[1].add(new Edge(1,2,-4));
        //vertex 2
        graph[2].add(new Edge(2,3,2));
        //vertex 3
        graph[3].add(new Edge(3,4,4));
        //vertex 4
        graph[4].add(new Edge(4,1,-1));
        
    }
    public static void bellmanFord(ArrayList<Edge>[] graph,int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        for(int i=0;i<graph.length-1;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                if(dist[e.src]!=Integer.MAX_VALUE&&dist[e.src]+e.wei<dist[e.dest]){//dist[u]+wt<dist[v]
                    dist[e.dest]=dist[e.src]+e.wei;//dist[v]=dist[u]+wt
                }
            }
        }
        for(int i=0;i<graph.length;i++){
            System.out.println(dist[i]);
        }
    }
    public static void main(String args[]){
      ArrayList<Edge>[] graph=new ArrayList[5];
      Create(graph);
      bellmanFord(graph, 0);
    }
}
