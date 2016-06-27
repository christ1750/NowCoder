package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年6月11日 下午3:00:22 
 * 类说明 
 */
public class Mixture {
	public boolean chkMixture(String A, int n, String B, int m, String C, int v){
		int x = LCS(A,n,C,v);
		int y = LCS(B,m,C,v);
		if(x == n && y == m && (x+y) == v){
			return true;
		}else{
			return false;
		}
	}
	public static int LCS(String A, int n, String B, int m){
		int dp[][] = new int[n+1][m+1];
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m+1; j++){
				if(A.charAt(i-1) == B.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1]+1;
				}else{
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		int max = 0;
		for(int i = 1; i<= n; i++){
			for(int j = 1; j <= m; j++){
				if(dp[i][j] > max){
					max = dp[i][j];
				}
			}
		}
		return max;
	}

}
