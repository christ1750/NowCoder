package JZoffer;

import java.util.Stack;

/** 
 * author: christ 
 * data：2016年3月3日 下午1:57:11 
 * 类说明 
 */

public class KthNodes {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		
		public TreeNode(int val){
			this.val = val;
		}
	}
	int count = 0;
	private int k;
	//非递归的中序遍历
	TreeNode KthNodeFDG(TreeNode pRoot,int k){
		if(count < k || pRoot == null){
			return null;
		}
		TreeNode p = pRoot;
		Stack<TreeNode> LDRStack = new Stack<TreeNode>();
		TreeNode kthNode = null;
		while(p != null || !LDRStack.isEmpty()){
			while(p != null){
				LDRStack.push(p);
				p = p.left;
			}
			TreeNode node = LDRStack.pop();
			System.out.println(node.val);
			count++;
			if(count == k){
				kthNode = node;
			}
			p = node.right;
		}
		return kthNode;
	}
	
	//递归的中序遍历
	TreeNode KthNodeDG(TreeNode pRoot,int k){
		this.k = k;
		return helper(pRoot);
	}
	private TreeNode helper(TreeNode pRoot){
		TreeNode temp = null;
		if(pRoot != null){
			if((temp = helper(pRoot.left)) != null){
				return temp;
			}
			if(--k == 0){
				return pRoot;
			}
			if((temp = helper(pRoot.right)) != null){
				return temp;
			}
			
		}
		return null;
	}

}
