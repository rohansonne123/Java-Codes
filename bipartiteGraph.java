import java.util.*;
public class bipartiteGraph {
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
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        //vertex 3
        //graph[3].add(new Edge(3,1,1));
       // graph[3].add(new Edge(3,2,1));
        //vertex 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,0,1));
    }
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int color[]=new int[graph.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            color[i]=-1;
        }
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                q.add(i);
                color[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        if(color[e.dest]==-1){
                            q.add(e.dest);
                            int nextcol=color[curr]==0?1:0;
                            color[e.dest]=nextcol;
                            
                        }else if(color[e.dest]==color[curr]){
                            return false;
                        }
                    }
                    
                }

            }
        }
        return true;
    }
    public static void main(String args[]){
        int v=4;
      ArrayList<Edge>[] graph=new ArrayList[v];
      Create(graph);
      System.out.println(isBipartite(graph));
    }
}
