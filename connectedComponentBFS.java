import java.util.*;
public class connectedComponentBFS {
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

        //vertex 1
        graph[1].add(new Edge(1,3,1));
        graph[1].add(new Edge(1,0,1));
        //vertex 2
        graph[2].add(new Edge(2,4,1));
        graph[2].add(new Edge(2,0,1));
        //vertex 3
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));

        //vertex 4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //vertex 5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //vertex 6
        graph[6].add(new Edge(6,5,1));
        
        
        }
    public static void BFS(ArrayList<Edge>[] graph){
        boolean[] visit=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                BFSutil(graph, visit);
            }
        }
    }
    public static void BFSutil(ArrayList<Edge>[] graph,boolean[] visit){
       Queue<Integer> q=new LinkedList<>();
       q.add(0);
       while(!q.isEmpty()){
        int curr=q.remove();
        if(!visit[curr]){
            System.out.println(curr);
            visit[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                q.add(e.dest);
            }
        }
       }
    }
    public static void main(String args[]){
        int v=7;
      ArrayList<Edge>[] graph=new ArrayList[v];
      Create(graph);
      BFS(graph);
    }
}
