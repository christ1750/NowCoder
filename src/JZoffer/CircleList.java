package JZoffer;
/** 
 * author: christ 
 * data��2016��3��8�� ����4:25:42 
 * ��˵�� 
 */

//p1����ָ��  ����x��� p1�൱������һ�����ĳ���
//p2�ǿ�ָ�룬����2x�����
//2x=x+n  x=n   ���� �ڵڶ��ε�ʱ������ָ��һ��������ڴ�����

public class CircleList {
	public static ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead == null || pHead.next == null){
			return null;
		}
		ListNode p1 = pHead;
		ListNode p2 = pHead;
		while(p2 != null && p2.next != null){
			p1 = p1.next;
			p2 = p2.next.next;
			if(p2 == null){
				return null;
			}
			if(p1 == p2){
				break;
			}
		}
		p1 = pHead;
		while(p1 != p2){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

}
