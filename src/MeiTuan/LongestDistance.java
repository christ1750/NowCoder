package MeiTuan;
/** 
 * author: christ 
 * data：2016年6月28日 下午3:59:27 
 * 类说明 
 */
public class LongestDistance {
	public int getDis(int[] A, int n){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n-1; j++){
				if(A[j]-A[i] > max){
					max = A[j]-A[i];
				}
			}
		}
		return max;
	}

}
