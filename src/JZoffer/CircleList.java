package JZoffer;
/** 
 * author: christ 
 * data：2016年3月8日 下午4:25:42 
 * 类说明 
 */

//p1是慢指针  走了x结点 p1相当于走了一个环的长度
//p2是快指针，走了2x个结点
//2x=x+n  x=n   所以 在第二次的时候，两个指针一定会在入口处相遇

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
