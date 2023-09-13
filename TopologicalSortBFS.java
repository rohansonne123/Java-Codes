import java.util.*;
public class TopologicalSortBFS {
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
    public static void Calculatedegree(ArrayList<Edge>[] graph,int degree[]){
          for(int i=0;i<graph.length;i++){
            int curr=i;
            for(int j=0;j<graph[curr].size();j++){
            Edge e=graph[curr].get(j);
            degree[e.dest]++;
            }
          }
    }
    public static void topoSortBFS(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        int degree[]=new int[graph.length];
        Calculatedegree(graph,degree);
        for(int i=0;i<graph.length;i++){
          if(degree[i]==0){
            q.add(i);

          }
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.println(curr);
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                degree[e.dest]--;
                if(degree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        Create(graph);
        topoSortBFS(graph);
    }
}
