import java.util.*;
public class AllPathExistGraph {
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
       // vertex 0
       graph[0].add(new Edge(0,3,1));
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
    public static void pathsExit(ArrayList<Edge>[] graph,int src,int dest,String path,boolean[] visit){
        //boolean[] visit=new boolean[graph.length];
        if(src==dest){
            System.out.print(path+dest+" ");
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!visit[e.dest]){
                pathsExit(graph, e.dest, dest, path+src,visit);
            }
        }
    }
    public static void main(String args[]){
     ArrayList<Edge>[] graph=new ArrayList[6];
     Create(graph);
     pathsExit(graph, 5, 1, "",new boolean[graph.length]);
    }
}
