package BATOffer;
/** 
 * author: christ 
 * data：2016年6月13日 上午10:02:18 
 * 类说明 
 */
public class CheckBalance {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public boolean check(TreeNode root){
		return chk(root)>=0;
	}
	private static int chk(TreeNode root){
		if(root == null){
			return 0;
		}
		int l = chk(root.left);
		int r = chk(root.right);
		if(l<0||r<0){
			return -1;
		}
		if(Math.abs(r-l)>1){
			return -1;
		}
		return r>l?r+1:l+1;
	}

}
