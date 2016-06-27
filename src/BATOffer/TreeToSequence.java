package BATOffer;

import java.util.LinkedList;
import java.util.List;

/** 
 * author: christ 
 * data：2016年6月12日 下午7:11:42 
 * 类说明 
 * 请用递归方式实现二叉树的先序、中序和后序的遍历打印。
 *给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 */
public class TreeToSequence {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
		public int getVal(){
			return val;
		}
	}	
	public int[][] convert(TreeNode root){
		List<TreeNode> preList = new LinkedList<>();
		List<TreeNode> midList = new LinkedList<>();
		List<TreeNode> afterList = new LinkedList<>();
			
		preOrderRecur(root,preList);
		midOrderRecur(root,midList);
		afterOrderRecur(root,afterList);
			
		int size = preList.size();
		System.out.println(size);
			
		int[][] res = new int[3][];
		int[] pre = new int[size];
		int[] mid = new int[size];
		int[] after = new int[size];
			
		for(int i = 0; i < size; i++){
			pre[i] = preList.get(i).getVal();
		}
		for(int i = 0; i < size; i++){
			mid[i] = midList.get(i).getVal();
		}
		for(int i = 0; i < size; i++){
			after[i] = afterList.get(i).getVal();
		}
			
		res[0] = pre;
		res[1] = mid;
		res[2] = after;
			
		return res;	
	}
	public void preOrderRecur(TreeNode head,List<TreeNode> pList){
		if(head == null){
			return;
		}
		pList.add(head);
		preOrderRecur(head.left,pList);
		preOrderRecur(head.right,pList);
	}
	
	public void midOrderRecur(TreeNode head,List<TreeNode> mList){
		if(head == null){
			return;
		}		
		preOrderRecur(head.left,mList);
		mList.add(head);
		preOrderRecur(head.right,mList);
	}
	
	public void afterOrderRecur(TreeNode head,List<TreeNode> aList){
		if(head == null){
			return;
		}		
		preOrderRecur(head.left,aList);
		preOrderRecur(head.right,aList);
		aList.add(head);
	}
}
