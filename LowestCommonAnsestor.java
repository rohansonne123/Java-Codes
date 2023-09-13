import java.util.*;
public class LowestCommonAnsestor {
    static class node{
        int data;
        node right;
        node left;
        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    } 
    //Lowest commen ancestor approach 1
    public static boolean getnode(node root,int n,ArrayList<node> path){
        if(root==null){
            return false;
        } 
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean leftdata=getnode(root.left,n,path);
        boolean rightdata=getnode(root.right,n,path);
        if(leftdata||rightdata){
            return true;
        }
        path.remove(path.size()-1);

        return false;
    }
    public static node LCR1(node root,int n1,int n2){ 

        ArrayList<node> path1=new ArrayList<>();
        ArrayList<node> path2=new ArrayList<>();

        getnode(root,n1,path1); 
        getnode(root,n2,path2);

        //checking lowest common 
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        } 

       node lcr=  path1.get(i-1);
       return lcr;
    }
    //lowest common ancestor approach 2
    public static node LCR2(node root,int n1,int n2){ 
    //    if(root==null){
    //         return null;
    //     }
        if(root==null||root.data==n1||root.data==n2){
            return root;
        } 
        node leftlcr=LCR2(root.left,n1,n2);
        node rightlcr=LCR2(root.right,n1,n2);
        
        if(rightlcr==null){
            return leftlcr;
        }
        if(leftlcr==null){
            return rightlcr;
        } 

        return root;
    }

    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.right.right=new node(6);
        root.left.left=new node(4);
        root.left.right=new node(5);
        System.out.println(LCR1(root,4,6).data);//apporach 1
        System.out.println(LCR2(root,4,6).data);//apporach 2
  
    }
}
