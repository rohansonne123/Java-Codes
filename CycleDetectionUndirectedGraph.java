import java.util.*;
public class CycleDetectionUndirectedGraph {
    static class Edge{
        int src;
        int dest;
        int wei;
        public Edge(int s,int d,int w){
            this.src=w;
            this.dest=d;
            this.wei=w;
        }
    }
    public static void Create(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        //vertex 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        //vertex 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,1,1));

        //vertex 3;
        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,4,1));

        //vertex 4
        graph[4].add(new Edge(4,3,1));
    }
    public static boolean DFS(ArrayList<Edge>[] graph){
        boolean[] visit=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                if(DFSutil(graph,i,-1,visit)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean DFSutil(ArrayList<Edge>[] graph,int curr,int par,boolean[] visit){
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //case 3
            if(!visit[e.dest]){
                if(DFSutil(graph, e.dest, curr, visit)){
                    return true;
                }
            }
            //case 1
            else if(e.dest!=par){
                return true;
            }
            //case 2---->continue
        }
        return false;
    }
    public static void main(String args[]){
        int v=7;
      ArrayList<Edge>[] graph=new ArrayList[v];
      Create(graph);
      System.out.println(DFS(graph));
      
    }
}
