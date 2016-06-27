package JZoffer;
/** 
 * author: christ 
 * data：2016年3月8日 下午8:14:22 
 * 类说明 
 */

//翻转链表，需要有三个指针同时在链表上滑动

public class reverseLink {
	public ListNode ReverseLink(ListNode head){
		if(head == null){
			return null;
		}
		ListNode newHead = null;
		ListNode pNode = head;
		ListNode pPrev = null;
		while(pNode != null){
			ListNode pNext = pNode.next;
			if(pNext == null){
				newHead = pNode;
			}
			pNode.next = pPrev;
			pPrev = pNode;
			pNode = pNext;
			
		}
		return newHead;
	}

}
