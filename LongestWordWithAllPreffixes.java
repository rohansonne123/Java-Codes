public class LongestWordWithAllPreffixes {
    static class node{
        node children[]=new node[26];
        boolean eow=false;
        node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static node root=new node();
    public static void insert(String str){
        node curr=root;
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new node();
            }

            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    static String ori=" ";
    public static void largestString(node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');
            temp.append(ch);
            if(temp.length()>ori.length()){
                ori=temp.toString();
            }
            largestString(root.children[i], temp);
            temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String args[]){
      String str[]={"apple","a","ap","app","appl","apply","banana"};
      for(int i=0;i<str.length;i++){
        insert(str[i]);
      }
      largestString(root, new StringBuilder(" "));
      System.out.println(ori);

    }
}
