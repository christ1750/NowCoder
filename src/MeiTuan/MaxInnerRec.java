package MeiTuan;
/** 
 * author: christ 
 * data：2016年6月28日 下午5:01:49 
 * 类说明 
 */
public class MaxInnerRec {
	public int countArea(int[] A, int n){
		int Max = 0;
		int max = 0;
		for(int i = 0; i < n; i++){
			int index = i;
			int lowest = A[i];
			while(index<n){
				if(lowest>A[index]){
					lowest = A[index];
				}
				max = lowest*(index-i+1);
				if(Max > max){
					Max = max;
				}
				index--;
			}
		}
		return Max;
	}

}
