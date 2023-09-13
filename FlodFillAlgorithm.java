public class FlodFillAlgorithm {
    public static void helper(int graph[][],int sr,int sc,boolean visit[][],int color,int orgcolor){
        if(sc<0||sr<0||sc>=graph[0].length||sr>=graph.length||visit[sc][sr]||graph[sr][sc]!=orgcolor){
            return;
        }
        
        graph[sr][sc]=color;
        //up side
        helper(graph,sr-1,sc,visit,color,orgcolor);
        //down side
        helper(graph,sr+1,sc,visit,color,orgcolor);
        //left side
        helper(graph,sr,sc-1,visit,color,orgcolor);
        //right side
        helper(graph,sr,sc+1,visit,color,orgcolor);
        //graph[sr][sc]=color;
        
    }
    public static void FlodFill(int graph[][],int sr,int sc,int color){
        boolean visit[][]=new boolean[graph.length][graph[0].length];//there is no much use of boolean visit in this case
        helper(graph,sr,sc,visit,color, graph[sr][sc]);
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int graph[][]={{1,1,1},
                        {1,1,0},
                        {1,0,1}};
        int sr=1;
        int sc=1;
        int color=2;
        FlodFill(graph,sr,sc,color);
    }
}
