import java.util.*;
public class ConnectedComponentDFS {
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
    public static void DFS(ArrayList<Edge>[] graph,boolean[] visit){
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
            DFSutil(graph, i,visit);
            }
        }
    }    
    public static void DFSutil(ArrayList<Edge>[] graph,int src,boolean[] visit){
        System.out.println(src+" ");
        visit[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!visit[e.dest]){
                DFSutil(graph,e.dest,visit);
            }
        }
    }    
    public static void main(String args[]){
     int v=7;
     ArrayList<Edge>[] graph=new ArrayList[v];
     Create(graph);
     DFS(graph,new boolean[graph.length]);
    }
}
