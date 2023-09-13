import java.util.*;
public class cycleDetectionDirectedGraph {
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
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        //vertex 2
        graph[2].add(new Edge(2,3,1));
        //vertex 3
        graph[3].add(new Edge(3,0,1));
    }
    public static boolean DFS(ArrayList<Edge>[] graph){
        boolean visit[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                if(isCycle(graph,i,visit,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(ArrayList<Edge>[] graph,int curr,boolean[] visit,boolean[] stack){
        visit[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            else if(!visit[e.dest] ){
                if(isCycle(graph, e.dest, visit, stack)){
                    return true;
                }
            }
        }
        stack[curr]=false;
        return false;
    }
    public static void main(String args[]){
      ArrayList<Edge>[] graph=new ArrayList[4];
      Create(graph);
      System.out.println(DFS(graph));
    }
}
