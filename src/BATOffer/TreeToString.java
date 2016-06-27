package BATOffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * author: christ 
 * data：2016年6月12日 下午8:31:27 
 * 类说明 
 */
public class TreeToString {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	
	public String toString(TreeNode root){
		List<String> list = new ArrayList<>();
		preOrder(root,list);		
		StringBuffer sb = new StringBuffer();
		Iterator it = list.iterator();
		while(it.hasNext()){
			sb.append(it.next());
		}
		return sb.toString();
	}
	public void preOrder(TreeNode root, List<String> plist){
		if(root == null){
			plist.add("#!");
		}
		plist.add(Integer.toString(root.val));
		plist.add("!");
		preOrder(root.left,plist);
		preOrder(root.right,plist);
	}

}
