package JZoffer;
/** 
 * author: christ 
 * data��2016��3��8�� ����8:14:22 
 * ��˵�� 
 */

//��ת������Ҫ������ָ��ͬʱ�������ϻ���

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
