package OnLineOfferLastYear;
/** 
 * author: christ 
 * data：2016年6月30日 下午3:53:45 
 * 类说明 
 */
public class MaxGap {
	public int findMaxGap(int[] A, int n){
		int res = 0;
		int max1 = 0;
		int max2 = 0;		
		for(int i = 0; i < n; i++){
			if(A[i] > max1){
				max1 = A[i];				
			}
		}
		max2 = Math.min(A[0], A[n-1]);		
		res = Math.abs(max1-max2);
		return res;
	}
}
