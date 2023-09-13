public class ArrayToBalancedBST {
  static class node{
                int data;
                node right;
                node left;
         public node(int data){
           this.data=data;
           this.right=this.left=null;

         }
  }
  public static node BalancedBST(int arr[],int si,int ei){
    if(si>ei){
      return null;
    }
    int mid=(si+ei)/2;
    node root=new node(arr[mid]);
   root.left= BalancedBST(arr,si,mid-1);
   root.right=BalancedBST(arr,mid+1,ei);

   return root;
  }
  public static void preorder(node root){
    if(root==null){
      return;
    }
    System.out.print(root.data+"");
    preorder(root.left);
    preorder(root.right);
  }
  public static void main(String args[]){
    int arr[]={3,4,5,6,7,8,9};
    node root=BalancedBST(arr,0,arr.length-1);
    preorder(root);
  }            
}
