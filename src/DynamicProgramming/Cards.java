package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年6月12日 下午12:12:51 
 * 类说明 
 */
public class Cards {
	public int cardGames(int[] arr, int n){
		int[][] f = new int[n][n];
		int[][] s = new int[n][n];
		for(int j = 0; j < n; j++){
			f[j][j] = arr[j];
			for(int i = j-1; i >= 0; i--){
				f[i][j] = Math.max(arr[i]+s[i+1][j], arr[j]+s[i][j-1]);
				s[i][j] = Math.min(f[i+1][j], f[i][j-1]);						
			}
		}
		return Math.max(f[0][n-1], s[0][n-1]);
	}		
}
