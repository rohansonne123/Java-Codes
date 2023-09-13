public class validBST {
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
    public static boolean valid_Bst(node root,node max,node min){
        if(root==null){
            return true;
        }
        if(min!=null&&root.data<=min.data){
            return false;
        }
        else if(max!=null&&root.data>=max.data){
            return false;
        }
        return valid_Bst(root.left,root,null)&&valid_Bst(root.right,null,root);
    }
    public static void main(String args[]){
        node root=null;
		int val[]= {8,5,3,1,4,6,10,11,14};
		for(int i=0;i<val.length;i++) {
			root=insert(root,val[i]);
		}

        if(valid_Bst(root,null,null)){
            System.out.println("BST is valid");
        }else{
            System.out.println("BST is not valid");
        }
    }
}
