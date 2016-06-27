package BATOffer;
/** 
 * author: christ 
 * data：2016年6月14日 下午3:58:03 
 * 类说明 
 */
public class CountNodes {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public int count(TreeNode root){
		if(root == null){
			return 0;
		}
		return bs(root,1,mostleftlevel(root,1));
	}
	public int bs(TreeNode node, int l, int h){
		if(l == h){
			return 1;
		}
		if(mostleftlevel(node.right,l+1) == h){
			return (1<<(h-l))+bs(node.right,l+1,h);
		}else{
			return (1<<(h-l-1))+bs(node.right,l+1,h);
		}
	}
	public int mostleftlevel(TreeNode node, int level){
		while(node != null){
			level++;
			node = node.left;
		}
		return level-1;
	}

}
