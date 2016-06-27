package wangyi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** 
 * author: christ 
 * data：2016年6月12日 下午1:15:34 
 * 类说明 
 */
public class Tree {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	HashMap<Integer,Integer> map = new HashMap();
	public int getDis(TreeNode root){
		path(root, map);
		int result = 0;
		List<Integer> minPath = findPath(min,map);
		List<Integer> maxPath = findPath(max,map);
		int lenMin = minPath.size();
		int lenMax = maxPath.size();
		for(int i = lenMin-1,j = lenMax-1; i>=0&&j>=0; i--,j--){
			if(minPath.get(i) == maxPath.get(j)){
				result = i+j;
			}
		}
		return result;
		
	}
	public void path(TreeNode root, HashMap<Integer, Integer> map){
		if(root == null){
			return;
		}
		if(root.left == null && root.right == null){
			max = Math.max(root.val, max);
			min = Math.min(root.val, min);
		}
		if(root.left != null){
			map.put(root.left.val, root.val);
			path(root.left,map);
		}
		if(root.right != null){
			map.put(root.right.val, root.val);
			path(root.right,map);
		}
	}
	public List<Integer> findPath(int n, HashMap<Integer,Integer> map){
		ArrayList<Integer> list = new ArrayList<>();
		while(map.containsKey(n)){
			list.add(n);
			n = map.get(n);
		}
		list.add(n);
		return list;
	}

}
