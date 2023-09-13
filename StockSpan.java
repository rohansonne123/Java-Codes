import java.util.*;
public class StockSpan { 
    public static void Span(int stocks[],int span[]){ 
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0); 
        for(int i=1;i<stocks.length;i++){ 
            int current=stocks[i];
            while(!s.isEmpty()&&current>=stocks[s.peek()]){
                s.pop();
            } 
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int preidx=s.peek();
                span[i]=i-preidx;
            } 
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[]={100,80,60,70,60,85,100}; 
        int span[]=new int[stocks.length]; 
        Span(stocks,span); 
        for(int i=0;i<stocks.length;i++){
            System.out.println(span[i]);
        }
    }
}
