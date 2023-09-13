import java.util.ArrayList;
import java.util.Stack;

public class StrictlyConnectedComponents {
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
    public static void Create(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[3].add(new Edge(3, 4, 1));
    }
    public static void Dfs(ArrayList<Edge>[] reverse,boolean[] visit,int curr){
         visit[curr]=true;
         System.out.print(curr+" ");
         for(int i=0;i<reverse[curr].size();i++){
            Edge e=reverse[curr].get(i);
            if(!visit[e.dest]){
               Dfs(reverse,visit,e.dest);
            }
            
         }
    }
    public static void topologicalSort(ArrayList<Edge>[] graph,boolean visit[],int curr,Stack<Integer> s){
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.dest]){
                topologicalSort(graph, visit, e.dest,s);
            }
    
        }
        s.push(curr);
       
    }
    public static void kosaraju(ArrayList<Edge>[] graph,int v){
        //step 1 for finding topological sorting
        boolean visit[]=new boolean[v];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<v;i++){
            if(!visit[i]){
              topologicalSort(graph,visit,i,s);
            }
        }
        

        //strp 2 for reversing the given graph
         ArrayList<Edge>[] reverse=new ArrayList[v];
         for(int i=0;i<graph.length;i++){
            reverse[i]=new ArrayList<Edge>();
         }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
              Edge e=graph[i].get(j);
              visit[i]=false;
               reverse[e.dest].add(new Edge(e.dest,e.src,e.wt));
               
        }
    }

        //step 3 performing dfs by using elements in given stack
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!visit[curr]){
                System.out.print("curr-->");
               Dfs(reverse, visit, curr);
               System.out.println();
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Edge>[] graph=new ArrayList[5];
        Create(graph);
        kosaraju(graph, 5);

    }
}
