package MeiTuan;
/** 
 * author: christ 
 * data：2016年6月23日 上午9:36:28 
 * 类说明 
 */
public class Stock {
	public int maxProfit(int[] prices, int n){
		int[] left = new int[n];
		int[] right = new int[n];
		int leftMin = prices[0];
		int rightMax = prices[n-1];
		int sum = 0;	
		for(int i = 1; i < n; i++){
			leftMin = Math.min(prices[i], leftMin);
			left[i] = Math.max(prices[i]-leftMin, left[i-1]);
		}
		
		for(int i = n-2; i >= 0; i--){
			rightMax = Math.max(prices[i], rightMax);
			right[i] = Math.max(rightMax-prices[i], right[i+1]);
		}
		
		for(int i = 0; i < n; i++){
			if(sum < left[i]+right[i]){
				sum = left[i]+right[i];
			}
		}
		
		return sum;
	}

}
