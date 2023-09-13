import java.util.*;
public class Merges2Trees {
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
    public static void inorder(node root,ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static node ValidBST(ArrayList<Integer> arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        node root=new node(arr.get(mid));
        root.left= ValidBST(arr,si,mid-1);
        root.right= ValidBST(arr,mid+1,ei);
        return root;
    }
    public static node Merge(node root1,node root2){
        ArrayList<Integer> arr1=new ArrayList<>();
        inorder(root1,arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root2,arr2); 
        int i=0;
        int j=0;
        ArrayList<Integer> finalarr=new ArrayList<>();
        while(i<=arr1.size()-1 && j<=arr2.size()-1){
           if(arr1.get(i)>=arr2.get(j)){
              finalarr.add(arr2.get(j));
              j++;
           }else{
               finalarr.add(arr1.get(i));
               i++;
           }
        } 
        while(i<=arr1.size()-1){
            finalarr.add(finalarr.get(i));
               i++;
        }
        while(j<=arr2.size()-1){
            finalarr.add(finalarr.get(j));
               j++;
        }
        return ValidBST(finalarr,0,finalarr.size()-1);
        
    }
    public static void inorder(node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
       node root1=new node(3);
       root1.left=new node(2);
       root1.right=new node(4);
       

        node root2=new node(6);
        root2.left=new node(5);
        root2.right=new node(7);
       node root= Merge(root1,root2);
       inorder(root);
        


    }
}
