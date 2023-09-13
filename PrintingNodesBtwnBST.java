public class PrintingNodesBtwnBST {
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
    public static void NodesBetween(node root,int k1,int k2){
        if(root==null){
            return;
        } 
        if(k1<=root.data&&root.data<=k2){
            NodesBetween(root.left,k1,k2);
            System.out.println(root.data);
            NodesBetween(root.right,k1,k2);
        }else if(root.data>k1){
            NodesBetween(root.right,k1,k2);
        }else{
            NodesBetween(root.left,k1,k2);
        }
    }
    public static void main(String args[]){
        node root=null;
		int val[]= {8,5,3,1,4,6,10,11,14};
		for(int i=0;i<val.length;i++) {
			root=insert(root,val[i]);
		}
    
    NodesBetween(root,2,12);
    }
    
}
