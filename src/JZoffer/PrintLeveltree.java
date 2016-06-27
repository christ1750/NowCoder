package JZoffer;

import java.util.ArrayList;
import java.util.LinkedList;

import JZoffer.PrintTopToBottom.TreeNode;

/** 
 * author: christ 
 * data��2016��3��5�� ����7:06:37 
 * ��˵�� 
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
		//�ؼ��ĵط�   Ҫ��������֪���Ƿ����������һ��
		int now = 1;//��ǰ��Ľ�����
		int next = 0; //��һ��Ľ�����
				
		while(!cur.isEmpty()){
			
			TreeNode t = cur.remove();
			now--;//��Ϊ�н������У�Ҫ����1��
			eveLevel.add(t.val);
			if(t.left != null){
				cur.add(t.left);
				next++;//��һ��������һ
			}
			if(t.right != null){
				cur.add(t.right);
				next++;
			}
			if(now == 0){ //˵����ǰ������н����ѳ���
				res.add(new ArrayList<Integer>(eveLevel));
				eveLevel.clear();
				now = next; //��һ�����Ϊ��ǰ�����
				next = 0;
			}
		}
		return res;
	}

}
