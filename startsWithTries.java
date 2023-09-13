public class startsWithTries {
    static class node{
        node children[]=new node[26];
        boolean eof=false;
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

        curr.eof=true;

    }

    public static boolean StartsWith(String preffix){
        node curr=root;
        for(int i=0;i<preffix.length();i++){
            int idx=preffix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String args[]){
      String str[]={"apple","app","mango","women"};
      String preffix1="app";
      String preffix2="man";
      String preffix3="mane";
      for(int i=0;i<str.length;i++){
        insert(str[i]);
      }

      System.out.println(StartsWith(preffix1));

      System.out.println(StartsWith(preffix2));

      System.out.println(StartsWith(preffix3));
    }
}
