package BATOffer;
/** 
 * author: christ 
 * data：2016年6月13日 上午10:57:37 
 * 类说明
 * 有一棵二叉树，其中所有节点的值都不一样,找到含有节点最多 的搜索二叉子树,并返回这棵子树的头节点.
 * 给定二叉树的头结点root，请返回所求的头结点,若出现多个节点最多的子树，返回头结点权值最大的。 
 */
public class MaxSubTree {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public TreeNode getMax(TreeNode root){
		if(root == null){
			return null;
		}
		int[] res = new int[3];
		return postOrder(root,res);
	}
	
	public TreeNode postOrder(TreeNode root, int[] res){
		if(root == null){
			res[0] = Integer.MIN_VALUE; //big
			res[1] = Integer.MAX_VALUE; //small
			res[2] = 0; //nodeNum
			return null;
		}
		TreeNode lnode = postOrder(root.left,res);
		int lmax = res[0];
		int lmin = res[1];
		int lnum = res[2];
		
		TreeNode rnode = postOrder(root.right,res);
		int rmax = res[0];
		int rmin = res[1];
		int rnum = res[2];
		
		res[0] = Math.max(rmax, root.val);
		res[1] = Math.min(lmin, root.val);
		
		if(lnode == root.left && rnode == root.right && lmax<root.val && rmin>root.val){
			res[2] = rnum+lnum+1;
			return root;
		}
		
		res[2] = Math.max(rnum, lnum);
		
		return rnum>=lnum?rnode:lnode;
	}
	

}
