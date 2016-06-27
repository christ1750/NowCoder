package JZoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


/** 
 * author: christ 
 * data：2016年3月4日 上午10:45:21 
 * 类说明 
 */
public class PrintTopToBottom {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		Deque<TreeNode> qe = new LinkedList<TreeNode>();
		if(root == null){
			return res;
		}
		TreeNode p = root;
		qe.add(root);
		while(!qe.isEmpty() || p != null){
			p = qe.poll();
			if(p.left != null){
				qe.add(p.left);
			}
			if(p.right != null){
				qe.add(p.right);
			}
			
			res.add(p.val);
		}
		return res;
	}
	

}
