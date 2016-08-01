package BATOffer;
/** 
 * author: christ 
 * data：2016年7月27日 上午10:55:30 
 * 类说明 
 */
public class LonelyA {
	public int getWays(int n, int A, int b, int c){
		int res1 = 1;
		int m = n;
		while(m > 0){
			res1 *=m;
			m--;
		}
		System.out.println(res1);
		int s = n-1;
		int res2 = 1;
		while(s > 0){
			res2 *=s;
			s--;
		}
		res2 = 4*res2;
		System.out.println(res2);
		int t = n-2;
		int res3 = 1;
		while(t > 0){
			res3 *=t;
			t--;
		}
		res3 = 2*res3;
		int res = res1 - res2 + res3;
		return res;
	}
	public static void main(String[] args){
		LonelyA a = new LonelyA();
		int aa = a.getWays(6, 1, 2, 3);
		System.out.println(aa);
	}
}
