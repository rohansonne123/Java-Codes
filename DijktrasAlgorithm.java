import java.util.*;
public class DijktrasAlgorithm {
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
        graph[0].add(new Edge(1,2,1));
        graph[0].add(new Edge(1,3,7));
        //vertex 2
        graph[0].add(new Edge(2,4,3));
        //vertex 3
        graph[0].add(new Edge(3,5,1));
        //vertex 4
        graph[0].add(new Edge(4,3,2));
        graph[0].add(new Edge(4,5,5));
    }
    static class pair implements Comparable<pair>{
        int v;
        int dist;
        public pair(int v,int d){
            this.v=v;
            this.dist=d;
        }
        @Override
        public int compareTo(pair p2){
            return this.dist-p2.dist;
        }
    }
    public static void dijktrasByBFS(ArrayList<Edge>[] graph,int Src){
        boolean[] visit=new boolean[graph.length];
        int dist[]=new int[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue<>();

        for(int i=0;i<graph.length;i++){
            if(i==Src){
                dist[i]=0;
            }else{
                dist[i]=Integer.MAX_VALUE;
            }
        }
        pq.add(new pair(Src, 0));

        while(!pq.isEmpty()){
            pair curr1=pq.remove();
            if(!visit[curr1.v]){
            visit[curr1.v]=true;
            for(int i=0;i<graph[curr1.v].size();i++){
                Edge e=graph[curr1.v].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wei;
                if(dist[u]+wt<dist[v]){
                    dist[v]=dist[u]+wt;
                    pq.add(new pair(v,dist[v]));
                }
            }
            }
        }
        for(int i=0;i<graph.length;i++){
            System.out.println(dist[i]);
        }
    }
    public static void main(String args[]){
      ArrayList<Edge>[] graph=new ArrayList[6];
      Create(graph);
      dijktrasByBFS(graph, 0);
    }
}
