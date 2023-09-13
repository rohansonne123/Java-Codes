public class BacktracingSubset {
    public static void Subset(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //Recursion
        Subset(str, ans+str.charAt(i), i+1);
        Subset(str, ans, i+1);   //backtracing
    }
    public static void main(String args[]){
        String str="abc";
        Subset(str,"",0);
    }
}
