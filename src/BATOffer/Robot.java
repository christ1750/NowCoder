package BATOffer;
/** 
 * author: christ 
 * data��2016��7��27�� ����10:28:05 
 * ��XxY�ķ����У������ϽǸ���Ϊ��㣬���½Ǹ���Ϊ�յ㣬ÿ��ֻ�������߻��������ߣ�����һ���ж����ֲ�ͬ���߷�
 *��������������int x,int y���뷵���߷���Ŀ����֤x��yС�ڵ���12�� 
 */
public class Robot {
	public int countWays(int x ,int y){
		int m = x-1;
		int n = x+y-2;
		int t = m;
		int mum = 1;
		int num = 1;
		if(x == 1 || y == 1){
			return 1;
		}
		while(m > 0){
			mum *=m;
			m--;
		}
		while(t > 0){
			num *=n;
			n--;
			t--;
		}
		int res = num/mum;
		return res;
	}
	public static void main(String[] args){
		Robot rt = new Robot();
		int s = rt.countWays(3, 9);
		System.out.println(s);
	}
}
