package DynamicProgramming;
/** 
 * author: christ 
 * data��2016��5��16�� ����10:38:06 
 * ��˵�� 
 */
public class LongestCommonSubsequence {
	public int findLCS(String A,int n, String B, int m){
		int[][] dp = new int[n][m];
		int res = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
				if(A.charAt(i) == B.charAt(j)){
					dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j]+1);
				}
				if(dp[i+1][j+1] > res){
					res = dp[i+1][j+1];
				}
			}
		}
		return res;		
	}
}
