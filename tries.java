public class tries {
    static class node{
        node children[]=new node[26];
        boolean eof=false;
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
        curr.eof=true;
    }
    public static boolean search(String str){
        node curr=root;
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eof==true;
    }
    public static void main(String args[]){
        String Words[]={"i","Love","my","india","Lovely"};
        for(int i=0;i<Words.length;i++){
           insert(Words[i]);
        }

        System.out.println(search("rohan"));

    }
}
