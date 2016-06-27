package DynamicProgramming;
/** 
 * author: christ 
 * data��2016��5��16�� ����10:39:07 
 * ��˵�� 
 */
public class LongestIncreasingSubsequence {	
	public int getLIS(int[] A,int n){
		int[] longest = new int[n];		
		for(int i = 0; i < A.length; i++){
			longest[i] = 1;			
		}
		int nLis = 1;		
		for(int i = 1; i < A.length; i++){
			for(int j = 0; j < i; j++){
				if(A[j] < A[i]){
					longest[i] = Math.max(longest[i], longest[j]);
				}
			}
			nLis = Math.max(nLis, longest[i]);
		}
		return nLis;
	}
}
