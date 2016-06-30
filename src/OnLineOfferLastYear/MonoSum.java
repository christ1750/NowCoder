package OnLineOfferLastYear;
/** 
 * author: christ 
 * data：2016年6月30日 上午10:35:26 
 * 类说明 
 */
public class MonoSum {
	public int calcMonoSum(int[] A, int n){
		int monSum = 0;
		if(n == 1){
			return monSum;
		}
		for(int i = 0; i < n; i++){
			int count = calcCount(A, n, i);
			monSum = monSum+A[i]*count;
		}
		return monSum;
	}
	public int calcCount(int[] A, int n, int index){
		int count = 0;
		for(int i = index+1; i < n; i++){
			if(A[i] >= A[index]){
				count++;
			}
		}
		return count;
	}
	

}
