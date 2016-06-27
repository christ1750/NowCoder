package BATOffer;

import java.util.ArrayList;
import java.util.Iterator;

import BATOffer.FindErrorNode.TreeNode;

/** 
 * author: christ 
 * data��2016��6��13�� ����11:08:47 
 * ��˵�� 
 * һ�ö�����ԭ�������������������������������ڵ������λ�ã�ʹ����ö�����������������������
 * ���ҵ�����������ڵ㲢�������ǵ�ֵ����֤�������н���ֵ������ͬ��
 * ����һ�����ĸ���㣬�뷵������������λ�õ�ֵ������С��ֵ��ǰ��
 */
public class FindErrorNode {
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public int[] findError(TreeNode root){
		ArrayList<TreeNode> list = new ArrayList<>();
		preOrder(root,list);
		int[] res = new int[2];
		for(int i = 0; i < list.size(); i++){
			if(i == 0){
				if(list.get(0).val > list.get(1).val){
					res[1] = list.get(0).val;
				}
			}
			else if(i == list.size()-1){
				if(list.get(list.size()-1).val < list.get(list.size()-2).val){
					res[0] = list.get(list.size()-1).val;
				}
			}else{
				if((list.get(i).val<list.get(i+1).val)&&((list.get(i).val<list.get(i-1).val))){
					res[0] = list.get(i).val;//small
							
				}
				if((list.get(i+1).val<list.get(i).val)&&((list.get(i).val>list.get(i-1).val))){
					if(res[1] == 0){
						res[1] = list.get(i).val;//big
					}
				}
			}						
		}
		
		return res;
	}
	private static void preOrder(TreeNode root, ArrayList<TreeNode> list){
		if(root == null){
			return;
		}		
		preOrder(root.left,list);		
		list.add(root);		
		preOrder(root.right,list);
		
	}
	
}
