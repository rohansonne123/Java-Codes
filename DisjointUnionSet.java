public class DisjointUnionSet {
    static int n=7;
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

        return find(par[x]);//return par[x]=find(par[x])------>gives us optimized solution less iteration and memory space
    }
    public static void Union(int a,int b){
        int A=find(a);
        int B=find(b);
        if(rank[par[A]]==rank[par[B]]){
            par[B]=par[A];
            rank[par[A]]++;
        }else if(rank[par[A]]<rank[par[B]]){
              par[par[A]]=par[B];
        }else{
            par[par[B]]=par[A];
        }
    }
    public static void main(String args[]){
     init();
     System.out.println(find(3));
     Union(1,3);
     System.out.println(find(3));
     Union(3,4);
     System.out.println(find(4));
     Union(1,4);
     System.out.println(find(3));
     
    }
}
