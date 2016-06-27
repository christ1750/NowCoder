package BATOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/** 
 * author: christ 
 * data：2016年6月12日 下午7:44:11 
 * 类说明 
 * 请用非递归方式实现二叉树的先序、中序和后序的遍历打印。
 *给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 */
public class TreeToSequence_01 {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public int[][] convert(TreeNode root){
		int[][] arr = new int[3][];
		if(root ==  null){
			return null;
		}
		List<Integer> list = new ArrayList<>();
		
		preOrder(list,root);
		
		int[] arr0 = new int[list.size()];
		int i = 0;
		for(int e:list){
			arr0[i++] = e;
		}
		arr[0] = arr0;
		list.clear();
		
		inOrder(list,root);
		int[] arr1 = new int[list.size()];
		i = 0;
		for(int e:list){
			arr1[i++] = e;
		}
		arr[1] = arr1;
		list.clear();
		
		postOrder(list,root);
		int[] arr2 = new int[list.size()];
		i = 0;
		for(int e:list){
			arr2[i++] = e;
		}
		arr[2] = arr2;
		list.clear();
		
		return arr;
	}
	private void preOrder(List list,TreeNode root){
		if(root == null){
			return;
		}
		Deque<TreeNode> stack = new ArrayDeque<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			list.add(node);
			if(node.right != null){
				stack.push(node.right);
			}
			if(node.left != null){
				stack.push(node.left);
			}
		}
	}
	
	private void inOrder(List list,TreeNode root){
		if(root == null){
			return;
		}
		Deque<TreeNode> stack = new ArrayDeque<>();
		stack.push(root);
		TreeNode cur = root.left;
		while(!stack.isEmpty() || cur != null){
			while(cur != null){
				stack.push(cur);
				cur = cur.left;
			}
			TreeNode node = stack.pop();
			list.add(node);
			if(node.right != null){
				cur = node.right;
			}
		}
	}
	
	private void postOrder(List list, TreeNode root){
		if(root == null){
			return;
		}
		Deque<TreeNode> stack = new ArrayDeque<>();
		stack.push(root);
		TreeNode c = null;
		TreeNode h = null;
		while(!stack.isEmpty()){
			c = stack.peek();
			if(c.left != null&&c.right != null && c.left !=h){
				stack.push(c.left);
			}
			else if(c.right != null && c.right != h){
				stack.push(c.right);
			}else{
				list.add(stack.pop().val);
				h = c;
			}
		}
	}

}
