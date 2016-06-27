package JZoffer;

import java.util.ArrayList;
import java.util.LinkedList;

import JZoffer.PrintTopToBottom.TreeNode;

/** 
 * author: christ 
 * data：2016年3月5日 下午7:06:37 
 * 类说明 
 */
public class PrintLeveltree {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> eveLevel = new ArrayList<Integer>();
		LinkedList<TreeNode> cur = new LinkedList<TreeNode>();
		TreeNode p = pRoot;
		if(pRoot != null){
			return res;
		}
		cur.push(p);
		//关键的地方   要计数，才知道是否遍历完整个一层
		int now = 1;//当前层的结点个数
		int next = 0; //下一层的结点个数
				
		while(!cur.isEmpty()){
			
			TreeNode t = cur.remove();
			now--;//因为有结点出队列，要减少1；
			eveLevel.add(t.val);
			if(t.left != null){
				cur.add(t.left);
				next++;//下一层结点数加一
			}
			if(t.right != null){
				cur.add(t.right);
				next++;
			}
			if(now == 0){ //说明当前层的所有结点均已出列
				res.add(new ArrayList<Integer>(eveLevel));
				eveLevel.clear();
				now = next; //下一层更新为当前结点数
				next = 0;
			}
		}
		return res;
	}

}
