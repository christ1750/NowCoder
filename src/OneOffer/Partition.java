package OneOffer;

/** 
 * author: christ 
 * data：2016年4月19日 下午8:41:59 
 * 类说明 
 */
public class Partition {
	public int[] getPartition(int[][] land, int n, int m) {
		// write code here
		int[] res = new int[2];
		int[] temp = new int[n];
		int least = 100000;
		int cur = 0;
		int j = 0;
		int k = 0;
		for (int i = 0; i < n; i++) {
			temp[i] = 1;
		}
		while (k < n) {
			for (int i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					if (land[j][i] != temp[i]) {
						cur++;
					}
				}
			}
			if (cur < least) {
				least = cur;
				res[0] = k;
				res[1] = k+1;

			}
			cur = 0;
			temp[k] = 0;
			k++;			
		}
		return res;
	}
	public static void main(String[] args) {
		Partition pa = new Partition();
		int[][] land = { { 0, 0, 0, 0 }, { 0, 1, 1, 1 }, { 1, 0, 1, 1 } };
		int[] res = pa.getPartition(land, 4, 3);
		System.out.println(res[0]);
	}
}
