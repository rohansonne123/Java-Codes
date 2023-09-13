import java.util.Stack;
public class DuplicateParenthesis { 
    public static boolean duplicateparenthesis(String str1){
        Stack<Character> s=new Stack<>(); 
        
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i); 
            int count=0;
            if(str1.charAt(i)!=')'){
                s.push(str1.charAt(i));
            }else{
                while(s.peek()!='('){ 
                    count++;
                    s.pop();
                } 
                s.pop();
                if(count<1){
                    return true;
                }
            }
        } 
        return false;
    }
    public static void main(String args[]){
        String str1="((a+b)+(c))"; 
        String str2="((a+b))"; 
       System.out.println(duplicateparenthesis(str1)); 
    }
}
