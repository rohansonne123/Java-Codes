import java.util.*;
public class firstNonReapeatingCharacter { 
    public static void FNRCharacter(String str){
       Queue<Character> q=new LinkedList<>(); 
       int count[]=new int[26]; 
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i); 
        q.add(ch);
        count[ch-'a']++;  
        while(!q.isEmpty()&&count[q.peek()-'a']>1){
            q.remove();
        } 
        if(q.isEmpty()){
            System.out.println(-1+" ");
        }else{
            System.out.println(q.peek()+" ");
        }
        
       }
    }
    public static void main(String args[]){
        String str="aabccxb"; 
        FNRCharacter( str);
    }
}
