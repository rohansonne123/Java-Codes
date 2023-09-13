import java.util.*;
public class GraphImplementation {
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
    public static void main(String args[]){
      //graph representation is array of arraylist
      int v=5;
      ArrayList<Edge>[] graph=new ArrayList[v];
      //now creating the empty list in array
      for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
      }

      //vertex 0
      graph[0].add(new Edge(0,1,1));

      //vertex 1
      graph[1].add(new Edge(1,0,1));
      graph[1].add(new Edge(1,2,2));
      graph[1].add(new Edge(1,3,4));

      //vert 2
      graph[2].add(new Edge(2,1,2));
      graph[2].add(new Edge(2,3,3));

      //vertex 3
      graph[3].add(new Edge(3,1,4));
      graph[3].add(new Edge(3,2,3));
      graph[3].add(new Edge(3,4,1));

      //vertex 4
      graph[4].add(new Edge(4,3,1));


      //printing neighbour of any node--> here we print the neighbour of 2
      for(int i=0;i<graph[2].size();i++){
        Edge e=graph[i].get(i);
        System.out.println(e.dest);
      }
    }
}
