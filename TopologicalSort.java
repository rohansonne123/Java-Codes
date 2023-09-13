import java.util.*;
public class TopologicalSort {
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
        //vertex 2
        graph[2].add(new Edge(2,3,1));
        //vertex 3
        graph[3].add(new Edge(3,1,1));
        //vertex 4
        graph[4].add(new Edge(4,0,1));
        graph[4].add(new Edge(4,1,1));
        //vertex 5
        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2,1));
    }
    public static void DFS(ArrayList<Edge>[] graph){
        Stack s=new Stack<>();
        boolean[] visit=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                topsort(graph,i,visit,s);
            }
        }
        while(!s.isEmpty()){
          System.out.println(s.pop());
        }
    }
    public static void topsort(ArrayList<Edge>[] graph,int curr,boolean[] visit,Stack s){
       visit[curr]=true;
       for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(!visit[e.dest]){
            topsort(graph, e.dest, visit, s);
        }
       }  
       s.push(curr); //backtracking step     
    }
    public static void main(String args[]){
        int v=6;
      ArrayList<Edge>[] graph=new ArrayList[v];
      Create(graph);
      DFS(graph);
    }
}
