package lec29;

public class Insert_into_Bst {
     public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){
            
        }
        TreeNode (int val) {this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right= right;
        }
    }
    class Solution{
        public TreeNode Insert_into_Bst(TreeNode root, int val){
            if(root == null){
                return new TreeNode(val);
            }
            if(root.val <val){
                root.right = Insert_into_Bst(root.right, val);

            }else{
                root.left = Insert_into_Bst(root.left, val);
            }
            return root;

        }
    }  
}
