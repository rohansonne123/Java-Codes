//Assignment 2
import java.util.LinkedList;
import java.util.*;
public class BST_Assignment2 {
    static class node{
        int data;
        node right;
        node left;
        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static node BST(node root,int val){
        if(root==null){
            root=new node(val);
            return root;
        }

        if(root.data>val){
            root.left=BST(root.left,val);
        }else{
            root.right=BST(root.right,val);
        }

        return root;
    }
    public static node inorder(node root){
        if(root==null){
            return null;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

        return root;

    }
    public static boolean SearchBST(node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(root.data>val){
           return SearchBST(root.left,val);
        }else{
           return  SearchBST(root.right,val);
        }

        
    }
    public static int Height(node root){
        if(root==null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);

        return Math.max(lh,rh)+1;
    }
    public static void LevelWiseTraversal(node root){
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node currnode=q.remove();
            if(currnode==null){
              if(q.isEmpty()){
                break;
              }else{
                q.add(null);
              }
            }else{
                System.out.println(currnode.data+" ");
                q.add(currnode.left);
                q.add(currnode.right);
            }
        }
    }
    public static node Deletenode(node root,int key){
        
        if(key>root.data){
            root.right=Deletenode(root.right, key);
        }else if(key<root.data){
            root.left=Deletenode(root.left, key);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }

            node IO=inorderSuccesor(root.right);
            root.data=IO.data;
            root.right=Deletenode(root.right, IO.data);
        }
        return root;
    }
    public static node inorderSuccesor(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static node Mirror(node root){
        if(root==null){
            return null;
        }
        node mirrorleft=Mirror(root.left);
        node mirrorright=Mirror(root.right);

        root.left=mirrorright;
        root.right=mirrorleft;

        return root;
    }
    public static void main(String args[]){
        node root=null;
      int arr[]={2,3,7,5,4,8,9};
      for(int i=0;i<arr.length;i++){
        root=BST(root,arr[i]);
      }

      inorder(root);
      System.out.println();
      root=Deletenode(root, 5);
      System.out.println("inorder of given tree after deleting 5");
      inorder(root);
      System.out.println();
      root=Mirror(root);
      System.out.println("The mirror of given BST is");
      inorder(root);
      System.out.println();
      System.out.println(SearchBST(root, 10));
      System.out.println(SearchBST(root, 9));
      System.out.println("The height of given BST is:");
      System.out.println(Height(root));
      System.out.println("level wise traversal :");
      LevelWiseTraversal(root);
      root=Deletenode(root, 5);
      inorder(root);
      root=Mirror(root);
      System.out.println("The mirror of given BST is");
      inorder(root);
    }
}
