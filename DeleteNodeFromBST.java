public class DeleteNodeFromBST {
    static class node{
        int data;
        node right;
        node left;
        public node(int data){
            this.data=data;
        }
    }
    public static node insert(node root,int val) {
    	if(root==null) {
    		root=new node(val);
    		return root;
    	} 
    	if(root.data<val) {
    		root.right=insert(root.right,val);
    	}else {
    		root.left=insert(root.left,val);
    	}
    	return root;
    }
    public static node deleteNode(node root,int val){
        if(root.data>val){
            root.left=deleteNode(root.left,val);
        }else if(root.data<val){
            root.right=deleteNode(root.right,val);
        }else{
            if(root.left==null&&root.right==null){
                return null;
            } 
            if(root.left==null){
                return root.right;
            } 
            else if(root.right==null){
                return root.left;
            } 

            node IO=inorderSuccesor(root.right);
            root.data=IO.data;
            root.right=deleteNode(root.right,IO.data);
        } 
        return root;
    }
    public static node inorderSuccesor(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    } 
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    public static void main(String args[]){ 
        node root=null;
		int val[]= {8,5,3,1,4,6,10,11,14};
		for(int i=0;i<val.length;i++) {
			root=insert(root,val[i]);
		}
        inorder(root);
        root=deleteNode(root,3);
        System.out.println();
        inorder(root);

    }
}
