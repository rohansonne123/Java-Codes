//Articulate point means the point from where the graph can be divided into the connected components
import java.util.*;
public class articulatePointInGraph {
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
    public static void Create(ArrayList<Edge> graph[],int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));

        //vertex 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        //vertex 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,0,1));

        //vertex 3
        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,4,1));

        //vertex 4
        graph[4].add(new Edge(4,3,1));

    } 
    public static void DFS(ArrayList<Edge> graph[],int v){
        int dt[]=new int[v];
        int low[]=new int[v];
        boolean visit[]=new boolean[v];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<v;i++){
            if(!visit[i]){
                ArticulatePoint(graph,dt,low,visit,-1,i,0,arr);
            }
        }

        for(int i=0;i<arr.size();i++){
            System.out.println("v :"+arr.get(i));
        }
    }
    public static void ArticulatePoint(ArrayList<Edge> graph[],int dt[],int low[],
    boolean visit[],int par,int curr,int time,ArrayList<Integer> arr){
        int children=0;
        visit[curr]=true;
        dt[curr]=low[curr]=++time;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(par==e.dest){
                continue;
            }else if(!visit[e.dest]){
               ArticulatePoint(graph, dt, low, visit, curr, e.dest, time,arr);
               low[curr]=Math.min(dt[curr],low[e.dest]);
               if(par!=-1 && dt[curr]<=low[e.dest]){
                 arr.add(curr);
               }
               children++;
            }else{
                low[curr]=Math.min(low[curr],low[e.dest]);
            }
        }
        if(par==-1 && children>1){
            arr.add(curr);
        }
    }
    public static void main(String args[]){
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        Create(graph,v);
        DFS(graph, v);
    }
}
