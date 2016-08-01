package BATOffer;
/** 
 * author: christ 
 * data：2016年7月27日 上午11:10:31 
 * 类说明 
 */
public class Distribution {
	public int getWays(int n, int m){
		int res = 1;		
		int mm = m;
		int mum = 1;
		int num = 1;
		while((mm-1) > 0){
			num *=(n-1);
			n--;
			mm--;
		}
		while(m-1 > 0){
			mum *=(m-1);			
			m--;
		}
		res = num/mum;
		return res;
	}
	public static void main(String[] args){
		Distribution dt = new Distribution();
		int a = dt.getWays(10, 3);
		System.out.println(a);
	}
}
