package BATOffer;
/** 
 * author: christ 
 * data：2016年6月13日 下午4:09:56 
 * 类说明 
 * 树上最大的距离
 */
public class LongestDistance {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public int findLongest(TreeNode root){
		int[] record = new int[1];
		return process(root,record);				
	}
	public int process(TreeNode root, int[] record){
		if(root == null){
			record[0] = 0;
			return 0;
		}
		int lmax = process(root.left,record);
		int maxfromleft = record[0];
		int rmax = process(root.right,record);
		int maxfromright = record[0];
		
		int cur = maxfromleft+maxfromright+1;
		record[0] = Math.max(maxfromleft, maxfromright)+1;
		return Math.max(Math.max(lmax, rmax), cur);
	}

}
