package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年5月16日 下午6:34:54 
 * 类说明 
 */
public class MinimumPath {
	public int getMin(int[][] map,int n,int m){
		int[][] dp = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				dp[i][j] = 100000;
			}
		}
		dp[0][0] = map[0][0];
		for(int i = 1; i < n; i++){
			dp[0][i] = map[0][i] + dp[0][i-1];
		}
		for(int j = 1; j < m; j++){
			dp[j][0] = map[j][0] + dp[j-1][0];
		}
		for(int i = 1; i < n; i++){
			for(int j = 1; j < m; j++){
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+map[i][j];
			}
		}
		return dp[n-1][m-1];
	}
	
}
