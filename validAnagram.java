import java.util.*;
public class validAnagram {
    public static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> hm=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(hm, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(hm.get(ch)!=null){
                if(hm.get(ch)==1){
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String args[]){
      String str1="rohan";
      String str2="nahro";
      boolean b=isAnagram(str1,str2);
      System.out.println(b);
    }
}
