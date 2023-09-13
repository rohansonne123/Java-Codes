import java.util.*;
public class Kruskals {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int dist;
        public Edge(int s,int d,int f){
            this.src=s;
            this.dest=d;
            this.dist=f;
        }

        @Override
        public int compareTo(Edge d2){
            return this.dist-d2.dist;
        }
    }
    
    static int n=4;
    static int par[]=new int[n];
    static int rank[]=new int[n];
    public static void init(){
        for(int i=0;i<par.length;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }

        return par[x]=find(par[x]);

    }
    public static void Union(int a,int b){
        int parA=find(a);
        int parB=find(b);
        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }else if(rank[parA]>par[parB]){
            par[parB]=parA;
        }else{
            par[parA]=parB;
        }
    }
    public static void krusAlgo(int v){
        ArrayList<Edge> graph=new ArrayList<>();
        graph.add(new Edge(0,1,10));
        graph.add(new Edge(0,2,15));
        graph.add(new Edge(0,3,30));
        graph.add(new Edge(1,3,40));
        graph.add(new Edge(2,3,50));

        Collections.sort(graph);

        int totalCost=0;
        int count=0;

        for(int i=0;count<v-1;i++){
            Edge e=graph.get(i);
            int parA=find(e.src);
            int parB=find(e.dest);
            if(parA!=parB){
                totalCost+=e.dist;
                Union(parA,parB);
                count++;
            }
        }
        System.out.println(totalCost);
    }
    public static void main(String args[]){
       init();
       int v=4;
       krusAlgo( v);
      
    }
}
