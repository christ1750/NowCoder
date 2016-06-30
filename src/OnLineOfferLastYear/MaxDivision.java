package OnLineOfferLastYear;

import java.util.Arrays;

/** 
 * author: christ 
 * data��2016��6��30�� ����5:05:41 
 * ��˵�� 
 */
public class MaxDivision {
	public int findMaxDivision(int[] A, int n){
		int max = Integer.MIN_VALUE;
		Arrays.sort(A);
		for(int i = n-1; i > 0; i--){
			if(A[i]-A[i-1] > max){
				max = A[i]-A[i-1];
			}
		}
		return max;
	}

}
