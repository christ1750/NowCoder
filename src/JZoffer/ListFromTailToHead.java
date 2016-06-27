package JZoffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/** 
 * author: christ 
 * data：2016年3月2日 下午4:12:37 
 * 类说明 
 */
public class ListFromTailToHead {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		Stack<Integer> res = new Stack<Integer>();
		ArrayList<Integer> ren = new ArrayList<Integer>();
		if(listNode == null){
			return ren;
		}
		while(listNode != null){
			res.push(listNode.val);
			listNode = listNode.next;
		}
		while(res.isEmpty()){
			ren.add(res.pop());
		}
		return ren;
	}

}
