package OnLineOfferLastYear;
/** 
 * author: christ 
 * data��2016��6��30�� ����3:16:22 
 * ��˵�� 
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
