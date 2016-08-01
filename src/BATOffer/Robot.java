package BATOffer;
/** 
 * author: christ 
 * data：2016年7月27日 上午10:28:05 
 * 在XxY的方格中，以左上角格子为起点，右下角格子为终点，每次只能向下走或者向右走，请问一共有多少种不同的走法
 *给定两个正整数int x,int y，请返回走法数目。保证x＋y小于等于12。 
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
