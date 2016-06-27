package JZoffer;
/** 
 * author: christ 
 * data：2016年2月27日 上午9:30:54 
 * 类说明 
 */
public class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val){
		this.val = val;
	}
}
public class isSymmetrical {
	boolean isSymmetrical(TreeNode pRoot){
		if(pRoot == null){
			return true;
		}else{
			return Symmetrical(pRoot.left,pRoot.right);
		}
	}
	public boolean Symmetrical(TreeNode left,TreeNode right){
		if(left == null && right == null){
			return true;
		}else if(left == null || right == null){
			return false;
		}else if(left.val != right.val){
			return false;
		}else{
			return Symmetrical(left.left,right.right) && Symmetrical(left.right,right.left);
		}
	}

}
