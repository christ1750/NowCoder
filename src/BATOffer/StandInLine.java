package BATOffer;
/** 
 * author: christ 
 * data：2016年7月27日 上午10:45:51 
 * 类说明 
 */
public class StandInLine {
	public int[] getWays(int n, int a, int b){
		int[] res = new int[2];
		int m = n-1;
		int res1 = 1;
		while(n > 0){
			res1 *=n;
			n--;
		}
		int res2 = 1;
		while(m > 0){
			res2 *=m;
			m--;
		}
		res[0] = res1/2;
		res[1] = res2;
		return res;
	}
	public static void main(String[] args){
		StandInLine sil = new StandInLine();
		int[] A = new int[2];
		A = sil.getWays(7, 1, 2);
		for(int i = 0; i < 2; i++){
			System.out.println(A[i]);
		}
	}
}
