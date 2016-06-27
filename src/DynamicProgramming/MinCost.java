package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年5月17日 上午8:50:04 
 * 类说明 
 */
public class MinCost {
	public int findMinCost(String A,int n,String B,int m,int c0,int c1,int c2){
		if((A == null && B == null) || (m == 0 && n == 0)){
			return 0;
		}
		int[] dp = new int[m+1];
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		for(int i = 0; i <= m; i++){
			dp[i] = i*c0;
		}
		for(int i = 1; i <= n; i++){
			int pre = dp[0];
			dp[0] = c1*i;
			for(int j = 1; j <= m; j++){
				int cur = 0;
				if(a[i-1] == b[j-1]){
					cur = pre;
				}else{
					cur = pre+c2;
				}
				pre = dp[j];
				dp[j] = Math.min(dp[j]+c1, Math.min(cur, dp[j-1]+c0));
			}
		}
		return dp[m];
	}
}
