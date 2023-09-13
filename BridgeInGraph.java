import java.util.*;
public class BridgeInGraph {
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
    public static void Create(ArrayList<Edge> graph[],int v){
       for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
       }
       //vertex 0
       graph[0].add(new Edge(0,1,1));
       graph[0].add(new Edge(0,3,1));
       graph[0].add(new Edge(0,2,1));
       //vertex 1
       graph[1].add(new Edge(1,2,1));
       graph[1].add(new Edge(1,0,1));
       //vertex 2
       graph[2].add(new Edge(2,1,1));
       graph[2].add(new Edge(2,0,1));

       //vertex 3
       graph[3].add(new Edge(3,0,1));
       graph[3].add(new Edge(3,4,1));
       graph[3].add(new Edge(3,5,1));

       //vertex 4
       graph[4].add(new Edge(4,3,1));
       graph[4].add(new Edge(4,5,1));
       //vertex 5
       graph[5].add(new Edge(5,3,1));
       graph[5].add(new Edge(5,4,1));

    }
    public static void DFS(ArrayList<Edge> graph[],int v,boolean visit[]){
       int dt[]=new int[v];
       int low[]=new int[v];
       for(int i=0;i<v;i++){
        if(!visit[i]){
            TargensAlgo(graph,v,visit,dt,low,i,i,0);
        }

       }
    }
    public static void TargensAlgo(ArrayList<Edge> graph[],int v,boolean visit[],int dt[],
    int low[],int curr,int par,int total){
          visit[curr]=true;
          dt[curr]=low[curr]=++total;
          for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(par==e.dest){
                continue;
            }else if(!visit[e.dest]){
                TargensAlgo(graph, v, visit, dt, low, e.dest, curr, total);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.println(curr+"---->"+e.dest);
                }
            }else{
                low[curr]=Math.min(low[e.dest],dt[curr]);
            }
          }
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        Create(graph, v);
        DFS(graph, v,new boolean[v]);
    }
}
