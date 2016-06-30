package OnLineOfferLastYear;
/** 
 * author: christ 
 * data：2016年6月30日 下午3:16:22 
 * 类说明 
 */
public class Rotate {
	public int[][] rotateMatrix(int[][] mat, int n){
		int[][] res = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				res[j][n-1-i] = mat[i][j];
			}
		}
		return res;
	}

}
