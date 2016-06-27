package BATOffer;
/** 
 * author: christ 
 * data：2016年4月28日 上午8:57:04 
 * 类说明 
 */
import java.util.*;
public class TreePrinter {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public int[][] printTree(TreeNode root){
		if(root == null){
			return null;
		}
		Queue<TreeNode> queue= new LinkedList<TreeNode>();
		queue.add(root);
		List<List<Integer>> lists = new ArrayList<>();
		//记录换行标志
		TreeNode last = root;
		//下一行换行标志
		TreeNode nextLast = root;
		List<Integer> list = new ArrayList<>();				
		while(!queue.isEmpty()){
			TreeNode p = queue.poll();
			list.add(p.val);
			if(p.left != null){
				queue.offer(p.left);
				nextLast = p.left;
			}
			if(p.right != null){
				queue.offer(p.right);
				nextLast = p.right;
			}
			if(p == last){
				lists.add(list);
				list = new ArrayList<Integer>();
				last = nextLast;
			}
			
		}
		int n = lists.size();
		int[][] res = new int[n][];
		for(int i = 0; i < n; i++){
			res[i] = new int[lists.get(i).size()];
			for(int j = 0; j < lists.get(i).size(); j++){
				res[i][j] = lists.get(i).get(j);
			}
		}
		return res;
	}
}
