package BATOffer;

import java.util.LinkedList;
import java.util.Queue;

/** 
 * author: christ 
 * data：2016年6月13日 上午10:16:11 
 * 类说明 
 * 判断是否是完全二叉树
 * 层序遍历
 */
public class CheckCompletion {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public boolean chk(TreeNode root){
		if(root == null){
			return true;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode cur = null;
		queue.offer(root);
		boolean flag = true;
		while(!queue.isEmpty()){
			cur = queue.poll();
			if(cur.left==null &&cur.right!=null ||((!flag)&&(cur.left!= null||cur.right!= null))){
				return false;
			}
			if(cur.left!= null){
				queue.offer(cur.left);
			}else{
				flag = true;
			}
			if(cur.right != null){
				queue.offer(cur.right);
			}else{
				flag = true;
			}
		}
		return true;
	}
}
