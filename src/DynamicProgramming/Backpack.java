package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年5月16日 下午7:01:36 
 * 类说明 
 */
public class Backpack {
	public int maxValue(int[] w, int[] v,int n, int cap){
		int[] dp = new int[1000];
		for(int i = 1; i <= cap; i++){
			dp[i] = -1;
		}
		dp[0] = 0;
		for(int i = 0; i < n; i++){
			for(int j = cap; j >=w[i]; j--){
				if(dp[j-w[i]] != -1){
					dp[j] = Math.max(dp[j],dp[j-w[i]]+v[i]);
				}
			}
		}
		int res = 0;
		for(int i = 0; i <= cap; i++){
			if(dp[i] > res){
				res = dp[i];
			}
		}
		return res;
	}
}
