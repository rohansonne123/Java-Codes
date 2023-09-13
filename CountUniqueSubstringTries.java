public class CountUniqueSubstringTries {
    static class node{
        node children[]=new node[26];
        boolean eow=false;
        node(){
            for(int i=0;i<children.length;i++){
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
    //making the function for counting the number of nodes
    public static int NumberOfNodes(node root){
        node curr=root;
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(curr.children[i]!=null){
                count+=NumberOfNodes(curr.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
       String str="ababa";
       for(int i=0;i<str.length();i++){
          String subs=str.substring(i);
          insert(subs);
       }

       System.out.println(NumberOfNodes( root));
    }
}
