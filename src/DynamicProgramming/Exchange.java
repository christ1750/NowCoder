package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年5月16日 下午6:28:47 
 * 类说明 
 */
public class Exchange {
	public int countWays(int[] penny,int n,int aim){
		int[] dp = new int[aim+1];
		for(int i = 0; i <= aim; i++){
			if(i % penny[0] == 0){
				dp[i] = 1;
			}
		}
		for(int i = 1; i < n; i++){
			for(int j = 1; j <= aim; j++){
				if(j >= penny[i]){
					dp[j] = dp[j] + dp[j-penny[i]];
				}
			}
		}
		return dp[aim];
	}
	public static void main(String[] args){
		Exchange ec = new Exchange();
		int[] penny = new int[8];
		int res = ec.countWays(penny, 8, 100);
		System.out.println(res);
	}
}
