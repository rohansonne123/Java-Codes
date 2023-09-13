public class prefixProblemTries {
    static class node{
        node children[]=new node[26];
        boolean eof=false;
        int frequency;
        public node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;

            }
            frequency=1;
        }
    }
    public static node root=new node();
    public static void insert(String str){
        node curr=root;
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new node();
            }else{
                curr.children[idx].frequency++;
            }
            curr=curr.children[idx];
        }
        curr.eof=true;
    }
    public static void FindTheWord(node root,String ans){
    
        if(root==null){
            return;
        }
        if(root.frequency==1){
           System.out.print(ans);
           return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                FindTheWord(root.children[i],ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String args[]){
        String str[]={"zebra","dog","dove","duck"};
        for(int i=0;i<str.length;i++){
            insert(str[i]);
        }
        root.frequency=-1;

        FindTheWord(root," ");

    }
}
